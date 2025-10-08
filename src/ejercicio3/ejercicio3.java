package ejercicio3;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        System.out.println("elige director");
        System.out.println("1.Christopher Nolan");
        System.out.println("2.Quentin Tarantino");
        System.out.println("3.Guillermo del Toro");
        Scanner sc = new Scanner(System.in);
        System.out.println("elige un director (pon los numeros)");
        String director = sc.nextLine();
        switch (director) {
            case "1":
                System.out.println("te recomiento inception");
                System.out.println("te gustan las peliculas de ciencia ficcion? ");
                String pelicula = sc.nextLine();
                if(pelicula.equals("si")){
                    System.out.println("Genial!Disfrutarás de sus mundos complejos");
                }else{
                    System.out.println("Quizás prefieras su película 'The Dark Knight', que es más de acción");
                }
                break;
                case "2":
                    System.out.println("pulp fiction");
                    System.out.println("te gustan las peliculas de ingenio? ");
                    String ingenio = sc.nextLine();
                    if(ingenio.equals("si")){
                        System.out.println("\"¡Perfecto! encantará el guion");
                    }else {
                        System.out.println("\"No te preocupes, la acción y la trama también son excelentes.");
                    }
                    break;
                    case "3":
                        System.out.println("el laberinto del fauno");
                        System.out.println("te gustan las historias de fantasia oscura");
                        String historia = sc.nextLine();
                        if(historia.equals("si")){
                            System.out.println("te sumergirás en un mundo mágico e inolvidable?");
                        }else{
                            System.out.println("Puedes probar con 'Pacific Rim' para una dosis de acción con monstruo gigantes");
                        }
                        break;
                        default:
                            System.out.println("Director no encontrado en nuestra base de datos");
                            break;
        }
    }
}
