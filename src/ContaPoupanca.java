import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ContaPoupanca extends Conta {

    private double juros;

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        this.juros = 0.02;
    }

    @Override
    public void sacar(double valor) {
        if (valor > getSaldo()) {
            System.out.println("Saldo insuficiente.");
        } else {
            super.sacar(valor);
        }
    }

    public void adicionarJuros() {
        double interest = getSaldo() * juros;
        depositar(interest);
        imprimirInfosComuns();
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }
}