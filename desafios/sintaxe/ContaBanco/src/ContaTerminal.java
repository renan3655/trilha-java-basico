import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha após o nextInt()

        System.out.print("Por favor, digite o Nome do Cliente: ");
        String nome = scanner.nextLine();

        System.out.print("Por favor, digite o Saldo da conta: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine(); // Consumir a nova linha após o nextDouble()

        String mensagem = "Olá " + nome + ", obrigado por criar uma conta em nosso banco," 
                + " sua agência é " + agencia 
                + ", conta " + numero 
                + " e seu saldo " + saldo 
                + " já está disponível para saque.";

        System.out.println(mensagem);

        scanner.close();

    }
}
