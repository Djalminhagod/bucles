package ejerciciosdowhile.ejercicio2;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        System.out.println("******************************************");
        System.out.println("******************************************");
        System.out.println("****           Bienvenido             ****");
        System.out.println("******************************************");
        System.out.println("******************************************");
        Scanner sc = new Scanner(System.in);
        int numero=1000;
        do {
            System.out.println("1.Consultar saldo");
            System.out.println("2.Ingresar dinero");
            System.out.println("3.Retirar dinero");
            System.out.println("4.Salir");
            String opcion = sc.nextLine();
            switch (opcion) {
                case "1":
                    System.out.println("Tienes "+numero+" €");
                    break;
                case "2":
                    System.out.println("Cuanto dinero quieres ingresar?");
                    int dinero = sc.nextInt();
                    numero=numero+dinero;
                    System.out.println("ingresas "+dinero);
                    System.out.println("tendrias saldo "+numero);
                    break;
                case "3":
                    System.out.println("cuanto quieres retirar?");
                    boolean retiradainvalida = true;
                    int retira = sc.nextInt();
                    if(retira>numero || retira<=0) {
                        System.out.println("numero no valido");
                        while (retiradainvalida) {
                            System.out.println("cuanto quieres retirar?");
                            retira = sc.nextInt();
                            if(retira<numero || retira>0) {
                                retiradainvalida = false;
                            }
                        }
                    }else{
                        numero=numero-retira;
                    }
                    System.out.println("retiras "+retira);
                    System.out.println("tendrias saldo "+numero);
                    break;
                case "4":
                    System.out.println("sales");
                    break;
            }
            System.out.println("tendrias saldo "+numero);

        }while (true);
    }
}
