package modelo;

public class ContaCorrente extends Conta implements Tributavel {
	
	public ContaCorrente(double saldo) {
		super(saldo);

	}
	
	@Override
	public double calcularTributos( ) {
		return getSaldo( ) *0.01;
	}
}