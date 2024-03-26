package algoritmo500;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class main500 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> vetorA = new ArrayList<>();
        List<Integer> vetorB = new ArrayList<>();

        String menu = """
                1. Dados do VETOR A\s
                2. Dados do VETOR B\s
                3 Imprime VETORES\s
                4. Soma VETORES\s
                5. Subtrai VETORES\s
                6. Sai do programa\s
                OPÇÃO:\s
                """;
        int opcao = 0;
        do {
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    leNumeros(vetorA);
                    break;
                case 2:
                    leNumeros(vetorB);
                    break;
                case 3:
                    imprimeVetores(vetorA, vetorB);
                    break;
                case 4:
                    somaVetores(vetorA, vetorB);
                    break;
                case 5:
                    subtraivetores(vetorA, vetorB);
                    break;
                case 6:
                    System.out.println("Saindo do programa");
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;

            }
        } while (opcao != 6);






    }
    public static void leNumeros(List<Integer> vetor){
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite o numero " + i + ":");
            vetor.add(scanner.nextInt());

        }
    }

    public static void imprimeVetores(List<Integer> vetorA, List<Integer> vetorB){
        System.out.println("vetorA");
        vetorA.forEach(System.out::println);
        System.out.println("vetorB");
        vetorB.forEach(System.out::println);

    }

    public static void somaVetores(List<Integer> vetorA, List<Integer> vetorB){
        List<Integer> listaSoma = IntStream.range(0, vetorA.size())
                .mapToObj(i -> vetorA.get(i) + vetorB.get(i))
                .toList();

        listaSoma.forEach(System.out::println);

    }

    public static void subtraivetores(List<Integer> vetorA, List<Integer> vetorB){
        List<Integer> listaSubtracao = IntStream.range(0, vetorA.size())
                .mapToObj(i->vetorA.get(i)-vetorB.get(i))
                .toList();
        listaSubtracao.forEach(System.out::println);

    }
}
