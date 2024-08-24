import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();


        System.out.print("Digite o sexo (Masculino/Feminino): ");
        String sexo = scanner.nextLine();


        System.out.print("Digite o estado civil (Solteira/Solteiro/Casada/Casado): ");
        String estadoCivil = scanner.nextLine();


        if (sexo.equalsIgnoreCase("Feminino") && estadoCivil.equalsIgnoreCase("Casada")) {

            System.out.print("Digite o tempo de casada (em anos): ");
            int tempoCasada = scanner.nextInt();
            System.out.println(nome + " está casada há " + tempoCasada + " anos.");
        } else {
            System.out.println(nome + ", você não precisa fornecer o tempo de casada.");
        }

        scanner.close();
    }
}
