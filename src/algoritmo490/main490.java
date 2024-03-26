package algoritmo490;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class main490 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listanomes = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite uma palavra em letras minusculas " + i + ":");
            listanomes.add(scanner.nextLine());

        }

        List<String> nomesModificados = modificaNomes(listanomes, "a");
        nomesModificados.forEach(System.out::println);


    }

    public static List modificaNomes(List<String> listanomes, String caractere){
        List<String> nomesModificados = listanomes.stream()
                .map(nome -> nome.replace(caractere, "*"))
                .collect(Collectors.toList());

        return nomesModificados;
    }

}
