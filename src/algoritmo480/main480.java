package algoritmo480;

import java.util.Scanner;

public class main480 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Digite um numero: ");
        n = scanner.nextInt();
        scanner.nextLine();

        String numeroString = String.valueOf(n);
        String numeroReverso = reverso(n);
        if (numeroString.equals(numeroReverso)){
            System.out.println(numeroString + " - " + numeroReverso);
            System.out.println("É um número capicua");
        } else {
            System.out.println(numeroString + " - " + numeroReverso);
            System.out.println("Não é um número capicua");
        }

    }
    public static String reverso(int numero) {
        String numeroString = String.valueOf(numero);

        String numeroInvertido = "";
        for (int i = 0; i < numeroString.length(); i++) {
            int ultimaPosicao = numeroString.length()-1;
            numeroInvertido += numeroString.charAt(ultimaPosicao-i);
        }
        return numeroInvertido;
    }

}
