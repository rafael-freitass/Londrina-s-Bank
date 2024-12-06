import LondrinaBank.ContaCorrente;
import LondrinaBank.ContaPoupanca;


import java.util.Scanner;

public class Main {

    public static void mostrarOpcoes() {
        System.out.println("O que deseja fazer?");
        System.out.println("[1] Deposito");
        System.out.println("[2] Saque");
        System.out.println("[3] Extrato");
        System.out.println("[4] Sair");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolha = 0;

        ContaCorrente cc = new ContaCorrente(1000);
        ContaPoupanca cp = new ContaPoupanca(2000);

        while (escolha!=3){
            System.out.println("Bem Vindo a Londrina's Bank!\n");
            System.out.println("Selecione seu tipo de conta:");
            System.out.println("[1] Conta Corrente");
            System.out.println("[2] Conta Poupança");
            System.out.println("[3] Sair");
            escolha = sc.nextInt();

            if (escolha == 1) {
                System.out.println("Conta corrente\n");
                System.out.println("Saldo atual: " + cc.getSaldo());
                mostrarOpcoes();
                int escolhaOpcoes = sc.nextInt();

                if (escolhaOpcoes == 1) {
                    System.out.println("Insira uma quantidade para depositar: ");
                    int quantidade = sc.nextInt();
                    cc.deposito(quantidade);
                } else if (escolhaOpcoes == 2) {
                    System.out.println("Cada Saque possue uma taxa de R$2 !!!\n");
                    System.out.println("Insira uma quantidade para saque: ");
                    int quantidade = sc.nextInt();
                    cc.aplicarTaxa();
                    cc.saque(quantidade);
                } else if (escolhaOpcoes == 3) {
                    cc.extrato();
                }
                else {
                    System.out.println("Opcão inválida!");
                    escolha = 3;
                }
            } else if (escolha == 2) {
                System.out.println("Conta poupança\n");
                System.out.println("Saldo atual: " + cp.getSaldo());
                mostrarOpcoes();
                int escolhaOpcoes = sc.nextInt();

                if (escolhaOpcoes == 1) {
                    System.out.println("Insira uma quantidade para depositar: ");
                    int quantidade = sc.nextInt();
                    cp.deposito(quantidade);
                    cp.aplicarTaxa();
                } else if (escolhaOpcoes == 2) {
                    System.out.println("Insira uma quantidade para saque: ");
                    int quantidade = sc.nextInt();
                    cp.saque(quantidade);
                } else if (escolhaOpcoes == 3) {
                    cp.extrato();
                }
                else {
                    System.out.println("Opcão inválida!");
                    escolha = 3;
                }
            } else if (escolha == 3) {
                System.out.println("Saindo");
            }
            else {
                System.out.println("opção inválida");
            }
        }
    }
}