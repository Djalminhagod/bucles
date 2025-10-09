package ejercicio5;

public class ejercicio5 {
    public static void main(String[] args) {
        int vidaPikachu = 1000;
        int vidaGengar = 1200;
        int ataquePikachu = 55;
        int ataqueGengar = 50;
        for(int i=3;i>=0;i--){
            vidaGengar-=ataquePikachu;
            vidaPikachu-=ataqueGengar;
            System.out.println("-----------------------------------------------------------");
            System.out.println("quedan "+i+" turnos");
            System.out.println("Pikachu ataca a Gengar, vida restante "+vidaGengar);
            System.out.println("Gengar ataca a Pikachu, vida restante "+vidaPikachu);
            System.out.println("-----------------------------------------------------------");
            if(vidaPikachu==0){
                System.out.println("-----------------------------------------------------------");
                System.out.println("Pikachu se ha desabilitado ");
                System.out.println("-----------------------------------------------------------");
                break;
            } else if (vidaGengar==0) {
                System.out.println("-----------------------------------------------------------");
                System.out.println("Gengar se ha desabilitado ");
                System.out.println("-----------------------------------------------------------");
                break;
            }else if (i==0){
                System.out.println("Te quedaste sin turnos ");
                System.out.println("-----------------------------------------------------");
                break;
            }

        }
        if(vidaPikachu<=0){
            System.out.println("------------------------------------------------------");
            System.out.println("GENGAR GANA EL COMBATE ");
            System.out.println("FIN DEL COMBATE");
            System.out.println("-----------------------------------------------------");
        }else if(vidaGengar<=0){
            System.out.println("-----------------------------------------------------");
            System.out.println("PIKACHU GANA EL COMBATE ");
            System.out.println("FIN DEL COMBATE");
            System.out.println("----------------------------------------------------");
        }
    }
}
