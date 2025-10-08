package ejercicio1;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        System.out.println("******************************************");
        System.out.println("******************************************");
        System.out.println("****           Bienvenido             ****");
        System.out.println("******************************************");
        System.out.println("******************************************");
        Scanner sc = new Scanner(System.in);
        int velocidad = sc.nextInt();
        boolean esExcesoVelocidad = true;
        if (velocidad <= 120) {
            esExcesoVelocidad = false;
            System.out.println("Velocidad normal");
        }else{
            System.out.println("Exceso de velocidad");
        }
    }
}
