
public class ContaCorrente extends Conta{

	 private double limiteChequeEspecial;

	    public ContaCorrente(double saldoInicial, double limiteChequeEspecial) {
	        super(saldoInicial);
	        this.limiteChequeEspecial = limiteChequeEspecial;
	    }

	    @Override
	    public void sacar(double valor) {
	        double saldoDisponivel = saldo + limiteChequeEspecial;
	        if (valor > 0 && valor <= saldoDisponivel) {
	            saldo -= valor;
	            System.out.println("Saque de R$" + valor + " realizado com sucesso (usando cheque especial se necessário).");
	        } else {
	            System.out.println("Saque inválido. Limite do cheque especial excedido ou valor inválido.");
	        }
	    }
}	
	

