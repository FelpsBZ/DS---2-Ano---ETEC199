// Implementação da Conta Poupança que herda de Conta
	class ContaPoupanca extends Conta {

	    public ContaPoupanca(double saldoInicial) {
	        super(saldoInicial);
	    }

	    @Override
	    public void sacar(double valor) {
	        if (valor > 0 && saldo >= valor) {
	            saldo -= valor;
	            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
	        } else {
	            System.out.println("Saque inválido. Saldo insuficiente ou valor inválido.");
	        }
	    }

	    public void aplicarRendimento(double taxaMensal) {
	        if (taxaMensal > 0) {
	            double rendimento = saldo * (taxaMensal / 100);
	            saldo += rendimento;
	            System.out.println("Rendimento de " + taxaMensal + "% aplicado. Saldo aumentado em R$" + rendimento);
	        } else {
	            System.out.println("Taxa de rendimento inválida.");
	        }
	    }
	    
}