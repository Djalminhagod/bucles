package ejerciciosdowhile.ejercicio3;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        boolean haganado = false;
        boolean haperdido = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("te levantas en una habitacion vacia ");
        System.out.println("en la habiatcion se veria una mesita, un armario y una puerta ");
        while(!haganado && !haperdido){
            System.out.println("1.Abro el cajon");
            System.out.println("2.Abro el armario");
            System.out.println("3.Abro el puerta");
            int llave;
            int opcion= sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("en el cajon no hay nada");
                    break;
                case 2:
                    System.out.println("en el armario hay una caja fuerte ");
                    System.out.println("que hacer?? lo intentas abrir o vuelves atras");
                    String cajafuerte = sc.next();
                    if(cajafuerte.equals("abri")){
                        for (int i = 5 ; i>=0; i--) {
                            System.out.println("Intruce codigo numerico del 1 al 10");
                            int codigo = sc.nextInt();
                            int codigoram = (int) (Math.random() * 10) + 1;
                            if (codigoram == codigo) {
                                System.out.println("Codigo correcto hay una llave ");
                                llave = 1;
                            } else {
                                System.out.println("Codigo no correcto ");
                            }
                            if (i==0){
                                System.out.println("se bloque la caja fuerte");
                                haperdido = true;
                            }
                        }

                    }else if(cajafuerte.equals("atras")){
                        System.out.println("Vuelves atras");
                    }
                    break;
                case 3:
                    System.out.println("la puerta estaria cerrada que haces?? ");
                    System.out.println("1.le das una patada ");
                    System.out.println("2.usas llave");
                    System.out.println("vuleves atras");
                    int puerta = sc.nextInt();
                    switch (puerta){
                        case 1:
                            int golpearpuerta = (int)(Math.random() *100) +1;
                            int puertapuerta = sc.nextInt();
                            if(golpearpuerta == puertapuerta){
                                System.out.println("Abriste la puerta ");
                                System.out.println("Has Ganado");
                            }else {
                                System.out.println("No se abrio");
                            }
                    }
            }
        }
    }
}
