
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");

		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		poupanca.adicionarJuros();
		
		poupanca.imprimirExtrato();

		System.out.println("Histórico de transações:");
        for (Transacao transaction : cc.getHistoricoTransacao()) {
            transaction.imprimeTransacao();
        }

		poupanca.imprimirExtrato();
	}

}
