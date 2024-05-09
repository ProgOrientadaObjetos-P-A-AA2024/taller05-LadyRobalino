package paquete1;

public class Calificaciones {

    private String nombreE;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double promedio;

    public Calificaciones(String n, double c1, double c2) {
        nombreE = n;
        calificacion1 = c1;
        calificacion2 = c2;
        calificacion3 = (calificacion1 + calificacion2) / 2;
    }

    public void establecerNombreE(String c) {
        nombreE = c;
    }

    public void establecerCalificacion1(double c) {
        calificacion1 = c;
    }

    public void establecerCalificacion2(double c) {
        calificacion2 = c;
    }

    public void establecerCalificacion3() {
        calificacion3 = (calificacion1 + calificacion2) / 2;
    }

    public void establecerPromedio() {
        promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
    }


    public String obtenerNombreE() {
        return nombreE;
    }

    public double obtenerCalificacion1() {
        return calificacion1;
    }

    public double obtenerCalificacion2() {
        return calificacion2;
    }

    public double obtenerCalificacion3() {
        return calificacion3;
    }

    public double obtenerPromedio() {
        return promedio;
    }

}
