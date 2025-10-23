package ejerciciosdowhile.ejercicio4;

import java.util.Scanner;

public class ejercicio4 {
    public  static void main(String[] args) {
        int intenstos2;
        boolean haganado = false;
        Scanner sc = new Scanner(System.in);
        int[]intentos=new int[100];
        int numerosecreto =(int)  (Math.random()*100) + 1;
        do {
            for(int i=1;i<intentos.length;i++){
                System.out.println("ingrese un numero del 1 al 100");
                intenstos2=sc.nextInt();
                System.out.println(numerosecreto);
                if(intenstos2==numerosecreto){
                    System.out.println("has ganado el numero era "+numerosecreto);
                    System.out.println("numero de intentos "+i);
                    for (int j=1;j<4;j++){
                        System.out.println("Felicidades as ganado");
                    }
                    haganado=true;
                    break;
                }else {
                    System.out.println("Incorrecto pruebe de nuevo");
                }
            }




        }while (!haganado);
    }
}
