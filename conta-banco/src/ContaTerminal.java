import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite sua agência: ");
        String agencia = scanner.nextLine(); 

        System.out.println("Digite o numero da sua conta: ");
        int numero=scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o seu saldo inicial: ");
        double saldo= scanner.nextDouble() ;

         String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numero, saldo);
        System.out.println(mensagem);

    }
}
