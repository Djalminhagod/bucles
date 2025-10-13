package ejercicioaula;

import java.util.Scanner;

public class ejerciciowhile {
    public static void main(String[] args) {
        int numeroraleatorio = (int) (Math.random() * 100) + 1;
        int intentos=1;
        boolean acertado = false;
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.println("Tiene"+intentos++);
            System.out.println("Adivina cual es el numero aleatorio ");
            int option = teclado.nextInt();
            if(option == numeroraleatorio){
                System.out.println("PREMIO ADIVINASTE ");
                acertado = true;

            }else if(numeroraleatorio<option ){}
            if(intentos>3){
                System.out.println("Te quedaste sin intentos el numero era "+numeroraleatorio);
                acertado = true;
            }


        }while(!acertado);



    }
}
