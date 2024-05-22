import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("\nDigite seu nome: ");
        String nome = scanner.next();

        System.out.println("\nDigite sua agencia: ");
        String agencia = scanner.next();
        
        System.out.println("\nDigite o numero da sua conta: ");
        int conta = scanner.nextInt();

        System.out.println("\nDigite o seu saldo: ");
        Double saldo = scanner.nextDouble();

        
        
        System.out.println("\n Ola " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo de R$" + saldo + " já está disponível para saque.\n");
        
    }
}
