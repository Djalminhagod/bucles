package ejerciciosdowhile.ejercicio1;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean respuesta = false;
        String respuesta1;
        int numero;
        int mayor;
        int menor;
        do {
            System.out.println("escribe 5 numeros para analizar cual es el mayor");
            numero = teclado.nextInt();
            mayor  = numero ;
            menor = numero;
            for (int i = 1; i<5; i++) {
                numero = teclado.nextInt();
                if (numero > mayor) {
                    mayor = numero;
                }else if (numero < menor) {
                    menor = numero;
                }



            }
            System.out.println("el mayor es "+mayor);
            System.out.println("el menor es "+menor);
            System.out.println("desaeas continuar (si/no)");
            respuesta1 = teclado.next();
            if (respuesta1.equals("no")) {
                System.out.println("Explosion");
                respuesta = true;

            }
        } while (!respuesta);
    }
}
