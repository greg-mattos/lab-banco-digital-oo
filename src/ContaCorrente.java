
public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}

	@Override
	protected void adicionarJuros() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'adicionarJuros'");
	}
	
}
