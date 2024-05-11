package paquete1;

import java.util.Scanner;

public class Ejecutor {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String cadenaFinal = "";
        String cedula;
        String marca;
        int anioFabricacion;
        int i = 0;
        int numI;
        double valorVehiculo;

        System.out.print("Ingrese el numero de iteraciones: ");
        numI = teclado.nextInt();

        while (i < numI) {

            teclado.nextLine();
            System.out.println("======================================");
            System.out.print(" Ingrese el numero de cedula: ");
            cedula = teclado.nextLine();
            System.out.print(" Ingrese la marca del vehiculo: ");
            marca = teclado.nextLine();
            System.out.print(" Ingrese el año de fabricacion: ");
            anioFabricacion = teclado.nextInt();
            System.out.print(" Ingrese el valor del vehiculo: ");
            valorVehiculo = teclado.nextDouble();

            Automotor auto = new Automotor(cedula, marca, anioFabricacion, valorVehiculo);

            auto.calcularValorMatricula();

            cadenaFinal += auto.toString();

            i++;
        }
        System.out.printf("%s\n", cadenaFinal);

    }
}
