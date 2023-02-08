import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la distancia recorrida (km):");
        double distancia = sc.nextInt();
        System.out.println("Introduzca el tiempo del recorrido (min):");
        double tiempo = sc.nextInt();
        tiempo = tiempo / 60;
        double velocidad = distancia / tiempo;
        System.out.println("Se ha desplazado a una velocidad de "+velocidad+"km/h.");
    }

}

