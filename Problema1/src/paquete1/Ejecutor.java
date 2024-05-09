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
        String opcion;
        Scanner entrada = new Scanner(System.in);

        // Inicio de proceso iterativo 
        bandera = true;
        while (bandera) { // bandera == true
            System.out.println("Ingrese el nombre del vendedor");
            nombre = entrada.nextLine();
            System.out.println("Ingrese edad del vendedor");
            edad = entrada.nextInt();
            System.out.println("Ingrese el salario mínimo");
            sMinino = entrada.nextDouble();
            System.out.println("Ingrese el número de autos vendidos");
            autos = entrada.nextInt();

            // con los datos ingresados se crea el objeto de tipo Vendedor
            Vendedor v = new Vendedor(nombre, edad, sMinino, autos);
            v.calcularPagoMensual();
            System.out.printf("Datos de Vendedor\n"
                    + "Nombre: %s\n"
                    + "Edad: %s\n"
                    + "Salario mínimo: %.2f\n"
                    + "Número de autos: %d\n"
                    + "Pago mensual: %.2f\n", v.obtenerNombres(), v.obtenerEdad(),
                    v.obtenerSalarioMinimo(), v.obtenerNumeroAutos(),
                    v.obtenerPagoMensual());

            entrada.nextLine(); // limpieza del buffer
            System.out.println("Desea ingresar más vendedores. Ingrese n para"
                    + " salir");
            opcion = entrada.nextLine();
            if (opcion.equals("n")) {
                bandera = false;
            }

        }
    }
    
}
