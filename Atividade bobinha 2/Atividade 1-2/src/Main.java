import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();

        System.out.print("Digite o valor de C: ");
        int C = scanner.nextInt();


        if (A + B < C) {
            System.out.println("A soma de A + B é menor que C.");
        } else {
            System.out.println("A soma de A + B não é menor que C.");
        }

        scanner.close();
    }
}
