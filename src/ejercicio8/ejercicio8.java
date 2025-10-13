package ejercicio8;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        boolean acertado=false;
        do {
            System.out.println("-----------------------------------------------------------");
            System.out.println("*** Pokédex Interactiva ***\n" +
                    "1. Buscar Pokémon por nombre\n" +
                    "2. Comparar estadísticas de Pokémon\n" +
                    "3. Salir\n" +
                    "Elige una opción:");
            System.out.println("-----------------------------------------------------------");
            Scanner teclado = new Scanner(System.in);
            String opcion = teclado.nextLine();
            switch (opcion) {
                case "1":
                    System.out.println("ingrese nombre pokemon");
                    String nombre = teclado.nextLine();
                    switch (nombre) {
                        case "pikachu":
                            System.out.println("Altura 0,4 m\n" +
                                    "Peso 6,0 kg\n" +
                                    "Sexo\n" +
                                    "Categorí aRatón\n" +
                                    "Habilidad\n" +
                                    "Elec. Estática\n" +
                                    "Tipo Eléctrico\n" +
                                    "Debilidad Tierra");
                            break;
                        case "mewtwo":
                            System.out.println("Height6' 07\"\n" +
                                    "Weight 269.0 lbs\n" +
                                    "Gender Unknown\n" +
                                    "Category Genetic\n" +
                                    "Abilities\n" +
                                    "Pressure\n" +
                                    "Type Psychic\n" +
                                    "Weaknesses Bug Ghost Dark");
                            break;
                        case "gyarados":
                            System.out.println("Altura 6,5 m\n" +
                                    "Peso 235,0 kg\n" +
                                    "Sexo\n" +
                                    "CategoríaA trocidad\n" +
                                    "Habilidad\n" +
                                    "Intimidación\n" +
                                    "TipoAguaVolador\n" +
                                    "Debilidad Eléctrico Roca");
                            break;
                            default:
                                System.out.println("no esta en la pokedex ese pokemon");
                                break;


                    }
                    break;
                    case "2":
                        System.out.println("comparar estadisticas");
                        int ataqueGroudon = 150;
                    int defensaGroudon= 140;
                    int ataqueKyogre = 150;
                    int defensaKyogre = 90;
                    if (defensaKyogre<defensaGroudon) {
                        System.out.println("defensaKyogre es mucho menos que la de groudon");
                    }if (ataqueKyogre==ataqueGroudon) {
                        System.out.println("El ataque es el mismo");
                    }
                    break;
                    case "3":
                        System.out.println("CERRANDO LA POKEDEX");
                        acertado=true;
                        break;
                        default:
                            System.out.println("no esta en la pokedex ese pokemon");
                            break;
            }
        }while (!acertado);
    }
}
