import java.util.Locale;
import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {
        
       //TODO: Conhecer e importar a classe Scanner 
       //Obter pela Scanner os valores digitados pelo terminal

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        //Exibir as mensagens para o Usuario 
        System.out.println("Digite seu número");
        int numero = scanner.nextInt();   
        
        System.out.println("Digite o numero da agencia");
        String agencia = scanner.next();

        System.out.println("Digite seu nome");
        String nomeCliente = scanner.next();
        
        System.out.println("Digite seu saldo");
        double saldo = scanner.nextDouble();

        //Exibir a mensagem conta criada 
        System.out.println("Olá " + nomeCliente );
        System.out.println("Obrigado por criar uma conta em nosso banco");
        System.out.println("Sua agencia é " + agencia);
        System.out.println("A conta: " + numero);
        System.out.println("Seu saldo: " + saldo + " e já está disponível para saque");

    
    }
} 