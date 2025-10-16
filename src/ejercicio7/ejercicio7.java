package ejercicio7;

public class ejercicio7 {
    public static void main(String[] args) {
        String coche1 ="muscle car";
        String coche2 ="Deportivo japones";
        double velociadad = 0.0;
        double distancia = 0.0;
        double coche1velociadad = 5.5;
        double coche2velociadad = 6.0;
        double velocidadnueva1 = 0.0;
        double velocidadnueva2 = 0.0;
        double distancianueva1 = 0.0;
        double distancianueva2 = 0.0;
for (int i = 0; i <= 15; i++) {
            velocidadnueva1 += velociadad + coche1velociadad;
            velocidadnueva2 += velociadad + coche2velociadad;
            distancianueva1 += distancia + velocidadnueva1;
            distancianueva2 += distancia + velocidadnueva2;
            System.out.println("segundo "+i+" "+coche1+" a recorrido "+distancianueva1+ " y el "+coche2+" a recorrido "+distancianueva2);
            if (distancianueva1>=400 && distancianueva2>=400) {
                System.out.println(coche1+" A CRUZADO LA META");
                System.out.println(coche2+" A CRUZADO LA META");
                if (distancianueva1>distancianueva2) {
                    System.out.println(coche1+" A GANADO la carrera");
                }else if (distancianueva1<distancianueva2) {
                    System.out.println(coche2+" A GANADO la carrera");
                }
                break;
            } else if (distancianueva1>=400 && distancianueva2<400) {
                System.out.println(coche1+" A CRUZADO LA META");
                System.out.println(coche2+" A GANADO");
                break;
            } else if (distancianueva1<400 && distancianueva2>=400) {
                System.out.println(coche2+"A CRUZADO LA META");
                System.out.println(coche2+" A GANADO");
                break;

        }
            if (i==15) {
            System.out.println("se acabo el tiempo ");
                if (distancianueva1>distancianueva2) {
                    System.out.println(coche1+" A GANADO la carrera");
                }else if (distancianueva1<distancianueva2) {
                    System.out.println(coche2+" A GANADO la carrera");
                }
            }
    }
    }
}
