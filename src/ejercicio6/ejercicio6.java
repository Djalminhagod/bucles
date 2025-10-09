package ejercicio6;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        System.out.println("******************************************");
        System.out.println("******************************************");
        System.out.println("****           Bienvenido             ****");
        System.out.println("******************************************");
        System.out.println("******************************************");
        String pelicula = "indiana jones y la ultima cruzada";
        String actor = "harrison ford";
        Scanner sc = new Scanner(System.in);
        boolean HaAdivinado = false;
        System.out.println("solo tienes 3 intentos");

        for (int i = 3; i>=0; i--) {
            System.out.println("te quedan "+i+" intentos");
            System.out.println("quien es el actor de " +pelicula);

            String actor2 = sc.nextLine();
            if (actor2.equalsIgnoreCase(actor)) {
                HaAdivinado = true;
                System.out.println("el actor es correcto" +actor);
                break;
            }else{
                System.out.println("el actor es incorrecto");
                System.out.println("vuelve a probar");
            }
            if (i==3){
                System.out.println("Su personaje a menudo lleva un sombrero y un látigo");
            } else if (i==2) {
                System.out.println("Pista 2: También es famoso por pilotar el Halcón Milenario en otra saga.");
            }else if (i==1) {
                System.out.println("el juego termina");
                break;
            }
            if (HaAdivinado == false){
                System.out.println("Perdiste el actor era "+actor);
            }
        }
    }
}
