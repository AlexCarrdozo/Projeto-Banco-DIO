import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        String Agencia, Nome;

        System.out.println("Por favor, digite o número da agência:");
        Agencia = s.nextLine();

        System.out.println("Digite o número da conta:");
        int Numero = s.nextInt();
        s.nextLine();

        System.out.println("Digite seu nome:");
        Nome = s.nextLine();

        System.out.println("Digite seu saldo:");
        BigDecimal Saldo = s.nextBigDecimal();

        System.out.println("Olá " +Nome+", obrigado por criar uma conta em nosso banco, sua agência é "+Agencia+", conta "+Numero+" e seu saldo "+Saldo+" já está disponível para saque");
    }
}
