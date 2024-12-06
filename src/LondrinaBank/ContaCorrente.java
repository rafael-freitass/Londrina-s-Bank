package LondrinaBank;

public class ContaCorrente extends Conta {
    private double taxaManutencao = 2.00;

    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void aplicarTaxa() {
        if (saldo >= taxaManutencao) {
            saldo -= taxaManutencao;
            String mensagem = "Taxa de manutenção de R$ " + taxaManutencao + " aplicada.";
            System.out.println(mensagem);
            historico.add(mensagem);
        } else {
            System.out.println("Saldo insuficiente para aplicar a taxa de manutenção.");
        }
    }
}
