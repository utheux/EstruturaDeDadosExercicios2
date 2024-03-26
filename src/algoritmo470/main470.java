package algoritmo470;

import java.util.Scanner;

public class main470 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numeroo");
        int numero = scanner.nextInt();
        scanner.nextLine();

        var primo = primo(numero);

        if (primo == 0){
            System.out.println("O numero " + numero + " é primo");
        } else {
            System.out.println("O numero " + numero + " não é primo");
        }

        scanner.close();
    }

    public static int primo(int numero){
        if (numero<2){
            return 1;
        }

        for (int i = 2; i <= numero/2; i++) {
            if (numero%i == 0 ){
                return 1;
            }
        }
        return 0;
    }
}
