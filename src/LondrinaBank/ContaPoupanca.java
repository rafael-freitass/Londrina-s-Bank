package LondrinaBank;

public class ContaPoupanca extends Conta {

    private double Rendimento = 0.01;

    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void aplicarTaxa() {
        double rendimento = saldo * Rendimento;
        saldo += rendimento;
        String mensagem = "Rendimento de R$ " + rendimento + " aplicado.";
        System.out.println(mensagem);
        historico.add(mensagem);
    }
}
