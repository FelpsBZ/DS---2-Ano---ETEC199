
public abstract class Conta implements OperacoesBancarias{
	
	 protected double saldo;

	    public Conta(double saldoInicial) {
	        this.saldo = saldoInicial;
	    }

	    public void depositar(double valor) {
	        if (valor > 0) {
	            saldo += valor;
	            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
	        } else {
	            System.out.println("Valor de depósito inválido.");
	        }
	    }

	    @Override
	    public double verificarSaldo() {
	        return saldo;
	    }

	    // Método sacar será abstrato para ser implementado nas subclasses
	    @Override
	    public abstract void sacar(double valor);

}



