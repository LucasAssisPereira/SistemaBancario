package entities;

public class Funcionario implements Runnable {
    private final Conta contaSalario;
    private final Conta contaInvestimento;
    private final double percentualInvestimento = 0.2;

    public Funcionario(double salario) {
        this.contaSalario = new Conta(salario);
        this.contaInvestimento = new Conta(0);
    }

    public void receberSalario(double salario) {
        contaSalario.depositar(salario);
        double valorInvestimento = salario * percentualInvestimento;
        contaSalario.sacar(valorInvestimento);
        contaInvestimento.depositar(valorInvestimento);
        System.out.println("Funcionário recebeu o salário e investiu R$ " + valorInvestimento);
    }

    public Conta getContaSalario() {
        return contaSalario;
    }

    @Override
    public void run() {
        System.out.println("Funcionário está realizando outras atividades...");
        atenderCliente();
        organizarProdutos();
        realizarRegistros();
    }

    public void atenderCliente() {
        System.out.println("Funcionário está atendendo um cliente.");
    }

    public void organizarProdutos() {
        System.out.println("Funcionário está organizando produtos na loja.");
    }

    public void realizarRegistros() {
        System.out.println("Funcionário está realizando registros no sistema.");
    }
}
