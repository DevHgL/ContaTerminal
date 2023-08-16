import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o número da sua agência: ");
        int agencia = scanner.nextInt();

        System.out.println("Por favor, digite o número da sua conta: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o saldo da sua conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", sua conta é " + numero + " e seu saldo é " + saldo + ". Ele já está disponível para saque.");
        scanner.close();
      }
}