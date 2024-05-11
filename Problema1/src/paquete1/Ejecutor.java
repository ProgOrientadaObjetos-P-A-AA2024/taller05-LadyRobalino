package paquete1;

import java.util.Scanner;

public class Ejecutor {
    public static void main(String[] args) {
        String nombreE;
        double calificacion1;
        double calificacion2;
        double calificacion3;
        double promedio;
        boolean bandera;
        int opcion;
        Scanner entrada = new Scanner(System.in);

        bandera = true;
        while (bandera) {
            System.out.println("=================MENU========================");
            System.out.println("Ingrese (1) si desea crear un objeto de 2 calificaiones:");
            System.out.println("Ingrese (2) si desea crear un objeto de 3 calificaiones:");
            System.out.println("Ingrese (3) para salir");
            opcion = entrada.nextInt();
            System.out.println("=============================================");
            

            if (opcion == 1) {
                System.out.print(" Ingrese nombre del estudiante: ");
                nombreE = entrada.next();
                System.out.print(" Ingrese calificacion 1: ");
                calificacion1 = entrada.nextDouble();
                System.out.print(" Ingrese calificacion 2: ");
                calificacion2 = entrada.nextDouble();

                Calificaciones estudiante = new Calificaciones(nombreE, calificacion1, 
                        calificacion2);
                estudiante.establecerPromedio();

                System.out.printf("%s",estudiante);
                
            } else if (opcion == 2) {
                System.out.println("=========================================");
                System.out.print("Ingrese nombre del estudiante: ");
                nombreE = entrada.next();
                System.out.print(" Ingrese calificacion 1: ");
                calificacion1 = entrada.nextDouble();
                System.out.print(" Ingrese calificacion 2: ");
                calificacion2 = entrada.nextDouble();
                System.out.print(" Ingrese calificacion 3: ");
                calificacion3 = entrada.nextDouble();

                Calificaciones estudiante = new Calificaciones(nombreE, calificacion1,
                        calificacion2, calificacion3);
                estudiante.establecerPromedio();

                System.out.printf("%s",estudiante);
            } else if (opcion == 3) {
                System.out.println("Saliendo...");
                bandera = false;
            } 
        }
    }    
}
