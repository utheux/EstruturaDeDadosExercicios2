package algoritmo460;
import java.util.Scanner;

public class main460 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o numero: ");
            int numero = scanner.nextInt();
            scanner.nextLine();
            System.out.println(dobraValor(numero));
        }

        scanner.close();



    }
    public static int dobraValor(int numero){
        return numero * 2;
    }


}
