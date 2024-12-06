package LondrinaBank;
import java.util.ArrayList;
import java.util.List;

public abstract class Conta {
    protected double saldo;
    protected List<String> historico;

    public Conta(double saldoInicial){
        this.saldo = saldoInicial;
        this.historico = new ArrayList<>();
        this.historico.add("Conta criada com saldo inicial de R$" + saldoInicial);
    }

    public double getSaldo(){
        return saldo;
    }

    public void extrato(){
        System.out.println("=== Extrato da Conta ===");
        for (int i = 0; i < historico.size(); i++) {
            System.out.println(historico.get(i));
        }
        System.out.println("Saldo atual: R$ " + saldo);
        System.out.println("========================");
    }

    public void deposito(double valor){
        if(valor > 0){
          this.saldo += valor;
          String mensagem = "Depósito de R$ " + valor + " realizado com sucesso.";
          System.out.println(mensagem);
          historico.add(mensagem);

        }
        else{
            String mensagem = "Tentativa de depósito inválido de R$ " + valor;
            System.out.println(mensagem);
            historico.add(mensagem);
        }
    }

    public void saque(double valor) {
        if (valor > 0 && valor <= saldo) {
            this.saldo -= valor;
            String mensagem = "Saque de R$ " + valor + " realizado com sucesso.";
            System.out.println(mensagem);
            historico.add(mensagem);
        } else {
            String mensagem = "Tentativa de saque inválido de R$ " + valor;
            System.out.println(mensagem);
            historico.add(mensagem);
        }
    }
    public abstract void aplicarTaxa();
}
