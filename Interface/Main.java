
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Sistema Bancário!");

        // Solicitando dados para a Conta Corrente
        System.out.println("Configuração da Conta Corrente:");
        System.out.print("Digite o saldo inicial da Conta Corrente: ");
        double saldoCorrente = scanner.nextDouble();

        System.out.print("Digite o limite de cheque especial da Conta Corrente: ");
        double limiteChequeEspecial = scanner.nextDouble();

        ContaCorrente contaCorrente = new ContaCorrente(saldoCorrente, limiteChequeEspecial);

        // Operações na Conta Corrente
        System.out.println("\nOperações na Conta Corrente:");
        System.out.print("Digite o valor para depósito na Conta Corrente: ");
        double depositoCorrente = scanner.nextDouble();
        contaCorrente.depositar(depositoCorrente);

        System.out.print("Digite o valor para saque na Conta Corrente: ");
        double saqueCorrente = scanner.nextDouble();
        contaCorrente.sacar(saqueCorrente);

        System.out.println("Saldo da Conta Corrente: R$" + contaCorrente.verificarSaldo());

        // Solicitando dados para a Conta Poupança
        System.out.println("\nConfiguração da Conta Poupança:");
        System.out.print("Digite o saldo inicial da Conta Poupança: ");
        double saldoPoupanca = scanner.nextDouble();

        ContaPoupanca contaPoupanca = new ContaPoupanca(saldoPoupanca);

        // Operações na Conta Poupança
        System.out.println("\nOperações na Conta Poupança:");
        System.out.print("Digite o valor para depósito na Conta Poupança: ");
        double depositoPoupanca = scanner.nextDouble();
        contaPoupanca.depositar(depositoPoupanca);

        System.out.print("Digite o valor para saque na Conta Poupança: ");
        double saquePoupanca = scanner.nextDouble();
        contaPoupanca.sacar(saquePoupanca);

        System.out.print("Digite a taxa de rendimento mensal (%) para aplicar na Conta Poupança: ");
        double taxaRendimento = scanner.nextDouble();
        contaPoupanca.aplicarRendimento(taxaRendimento);

        System.out.println("Saldo da Conta Poupança: R$" + contaPoupanca.verificarSaldo());

        scanner.close();
    }
}
