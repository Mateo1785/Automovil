package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Ingresar datos para el automóvil
        System.out.println("***********************************");
        System.out.println("**Ingrese los datos del automóvil:**");
        System.out.println("***********************************");
        System.out.print("Marca: ");
        String marca = scan.nextLine();
        System.out.print("Modelo: ");
        int modelo = scan.nextInt();
        System.out.print("Motor (litros): ");
        double motor = scan.nextDouble();
        scan.nextLine();
        System.out.println("***********************************");
        System.out.print("Elije el tipo de combustible: ");
        System.out.println("Tipo de combustible:");
        System.out.println("1. Gasolina");
        System.out.println("2. Bioetanol");
        System.out.println("3. Diésel");
        System.out.println("4. Biodiésel");
        System.out.println("5. Gas natural");
        int tipoCombus = scan.nextInt();
        System.out.println("***********************************");
        System.out.print("Elije el tipo de automóvil: ");
        System.out.println("1. Carro de ciudad");
        System.out.println("2. Subcompacto");
        System.out.println("3. Compacto");
        System.out.println("4. Familiar");
        System.out.println("5. Ejecutivo");
        System.out.println("6. SUV");
        int tipoAuto = scan.nextInt();
        System.out.println("***********************************");
        System.out.print("Número de puertas: ");
        int numPuertas = scan.nextInt();
        System.out.print("Cantidad de asientos: ");
        int cantAsientos = scan.nextInt();
        System.out.print("Velocidad máxima (km/h): ");
        int velMax = scan.nextInt();
        scan.nextLine();
        System.out.print("Color: ");
        String color = scan.nextLine();

        // Crear el automóvil
        Vehiculo auto = new Vehiculo (marca, modelo, motor,"","", numPuertas, cantAsientos, velMax, color);

        //Aqui imprime lo seleccionado en combustible  y su tipo
        auto.asigTipoCombus(tipoCombus);

        //Aqui imprime lo seleccionado en tipos de autos.
        auto.asigTipoAuto(tipoAuto);

        // Configurar la velocidad inicial del automóvil
        auto.setVelActual(100);
        System.out.println("Velocidad actual: " + auto.getVelActual() + " km/h");

        // Aumentar la velocidad
        auto.acelerar(20);

        // Disminuir la velocidad
        auto.desacelerar(50);

        // Frenar
        auto.frenar();

        // Aqui se imprime los datos del automóvil
        auto.mostrarDatos();
    }
}