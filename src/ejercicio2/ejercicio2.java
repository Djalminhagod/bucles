package ejercicio2;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        System.out.println("******************************************");
        System.out.println("******************************************");
        System.out.println("****           Bienvenido             ****");
        System.out.println("******************************************");
        System.out.println("******************************************");
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es el nombre del jugador");
        String nombre = sc.nextLine();
        System.out.println("Cuantos partidos jugo");
        double   partidos = sc.nextInt();
        System.out.println("Cuantos goles marco el jugador");
        double marco = sc.nextInt();
        double resulrado = marco / partidos;
        if (marco<=0 || partidos <= 0 || resulrado <= 0) {
            System.out.println("El resultado no es valido");
        }
        else if (resulrado >=0.8) {
            System.out.println("Balon de oro");
            System.out.printf("el jugador "+nombre+" tiene un promedio %1.2f", +resulrado);
        } else if (resulrado>=0.5) {
            System.out.println("balon de playa");
            System.out.printf("el jugador "+nombre+" tiene un promedio %1.2f", +resulrado);
        }else if (resulrado<0.5) {
            System.out.println("penaldo triste");
            System.out.printf("el jugador "+nombre+" tiene un promedio %1.2f", resulrado);
        }
    }
}
