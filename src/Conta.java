import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	private List<Transacao> historicoTransacao = new ArrayList<>();

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
		Transacao transaction = new Transacao(new Date(), valor, "Saque");
        historicoTransacao.add(transaction);
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
		  Transacao transaction = new Transacao(new Date(), valor, "Deposito");
        historicoTransacao.add(transaction);
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

	protected abstract void adicionarJuros();

}

