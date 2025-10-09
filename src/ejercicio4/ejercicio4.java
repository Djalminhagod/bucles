package ejercicio4;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Cual es el nombre del pokemon ");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        System.out.println("Cual es el nivel acual de tu "+nombre);
        int nivel = sc.nextInt();
        System.out.println("cuantos nivesles quieres que suba ");
        int nivelsub = sc.nextInt();
        int niveltotal = nivel+nivelsub;
        for(int i=nivel+1;i<=niveltotal; i++){
            System.out.println("el pokemon "+nombre+" sube de nivel "+i);
            if(i==16 || i==36){
                System.out.println("vaya "+nombre+" esta evolucionando ");
            }
        }
    }
}
