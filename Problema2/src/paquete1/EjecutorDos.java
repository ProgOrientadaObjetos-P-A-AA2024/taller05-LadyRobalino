package paquete1;

import java.util.Scanner;

public class EjecutorDos {

    public static void main(String[] args) {

        Scanner tecla = new Scanner(System.in);

        int anioFabricacion;
        double valorVehiculo;
        String cedula, marca, opcion, cadenaFinal = "";

        boolean bandera = true;

        while (bandera) {

            System.out.print(" Ingrese el numero de cedula: ");
            cedula = tecla.nextLine();
            System.out.print(" Ingrese la marca del vehiculo: ");
            marca = tecla.nextLine();
            System.out.print(" Ingrese el año de fabricacion: ");
            anioFabricacion = tecla.nextInt();
            System.out.print(" Ingrese el valor del vehiculo: ");
            valorVehiculo = tecla.nextDouble();
            System.out.println("=============================================");

            Automotor autos = new Automotor(cedula, marca, anioFabricacion,
                    valorVehiculo);

            autos.calcularValorMatricula();

            cadenaFinal += String.format("DATOS DE LA MATRICULA"
                    + " Cedula: %s\n"
                    + " Marca del vehiculo: %s\n"
                    + " Año de fabricacion: %d\n"
                    + " Valor del vehiculo: $ %.3f\n\n",
                    autos.obtenerCedula(),
                    autos.obtenerMarcaVehiculo(),
                    autos.obtenerAnioFabricacion(),
                    autos.obtenerValorVehiculo(),
                    autos.obtenerValorMatricula());

            tecla.nextLine();

            System.out.println("Desea ingresar mas datos? o ingrese x para salir");
            opcion = tecla.nextLine();
            if (opcion.equals("x")) {
                System.out.println("\nSaliendo...\n");
                bandera = false;
            }
        }
        System.out.printf("%s", cadenaFinal);
    }
}
