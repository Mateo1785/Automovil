package org.example;

public class Vehiculo {

    /*
    Atributos del Vehiculo:

    •	Marca: el nombre del fabricante.
    •	Modelo: año de fabricación.
    •	Motor: volumen en litros.
    •	Tipo de combustible: valor enumerado con los posibles valores de gasolina, bioetanol, diésel, biodiésel, gas natural.
    •	Tipo de automóvil: valor enumerado con los posibles valores de carro de ciudad, subcompacto, compacto, familiar, ejecutivo, SUV.
    •	Número de puertas: cantidad de puertas.
    •	Cantidad de asientos: número de asientos disponibles que tiene el vehículo. u Velocidad máxima: velocidad máxima sostenida por el vehículo en km/h.
    •	Color: valor enumerado con los posibles valores de blanco, negro, rojo, naranja, amarillo, verde, azul, violeta.
    •	Velocidad actual: velocidad del vehículo en un momento dado.

     */
    String marca;
    int modelo;
    double motor;
    String tipoCombus;
    String tipoAuto;
    int numPuertas;
    int cantAsientos;
    int velMax;
    String color;
    int velActual;

    Vehiculo(){
    }

    Vehiculo(String marca, int modelo, double motor, String tipoCombus, String tipoAuto,
             int numPuertas, int cantAsientos, int velMax, String color) {

        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombus = tipoCombus;
        this.tipoAuto = tipoAuto;
        this.numPuertas = numPuertas;
        this.cantAsientos = cantAsientos;
        this.velMax = velMax;
        this.color = color;
        this.velActual = 0;

    }

    //
    public void asigTipoCombus(int opcionTipo) {
        switch (opcionTipo) {
            case 1:
                tipoCombus = "Gasolina: $ 2,858477";
                break;
            case 2:
                tipoCombus = "Bioetanol: $ 65,420";
                break;
            case 3:
                tipoCombus = "Diesel: $ 3,212729";
                break;
            case 4:
                tipoCombus = "Biodiesel: $  1.037";
                break;
            default:
                tipoCombus = "GasNatural: $ 0,106667";
                break;
        }
    }

    //
    public void asigTipoAuto(int opTipo) {
        switch (opTipo) {
            case 1:
                tipoAuto = "CarroCiudad: $ 12 899";
                break;
            case 2:
                tipoAuto = "Subcompacto: $ 20,000";
                break;
            case 3:
                tipoAuto = "Compacto: $ 30,000";
                break;
            case 4:
                tipoAuto = "Familiar: $ 40,000";
                break;
            case 5:
                tipoAuto = "Ejecutivo: $ 30,000";
                break;
            default:
                tipoAuto = "SUV: $ 50,000";
                break;
        }
    }


    // Métodos get y set
    public int getVelActual() {
        return velActual;
    }

    public void setVelActual(int velActual) {
        this.velActual = velActual;
    }

    // Método para acelerar el automóvil
    public void acelerar(int velocidad) {
        if (velActual + velocidad <= velMax) {
            velActual += velocidad;
            System.out.println("Velocidad actual: " + velActual + " km/h");
        } else {
            System.out.println("No es posible acelerar más allá de la velocidad máxima permitida.");
        }
    }

    // Método para desacelerar el automóvil
    public void desacelerar(int velocidad) {
        if (velActual - velocidad >= 0) {
            velActual -= velocidad;
            System.out.println("Velocidad actual: " + velActual + " km/h");
        } else {
            System.out.println("No es posible desacelerar a una velocidad negativa.");
        }
    }

    // Método para frenar el automóvil
    public void frenar() {
        velActual = 0;
        System.out.println("El automóvil ha frenado. Velocidad actual: " + velActual + " km/h");
    }

    // Método para calcular el tiempo estimado de llegada
    public double calcularTiempoEstimadoLlegada(int distancia) {
        return (double) distancia / velActual;
    }

    // Método para mostrar los valores de los atributos del automóvil
    public void mostrarDatos() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Motor: " + motor + " litros");
        System.out.println("Tipo de combustible: " + tipoCombus);
        System.out.println("Tipo de automóvil: " + tipoAuto);
        System.out.println("Número de puertas: " + numPuertas);
        System.out.println("Cantidad de asientos: " + cantAsientos);
        System.out.println("Velocidad máxima: " + velMax + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Velocidad actual: " + velActual + " km/h");
    }
}