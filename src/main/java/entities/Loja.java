package entities;

public class Loja {
    private String nome;
    private final Conta contaLoja;
    private final double salarioFuncionario = 1400.0;

    public Loja() {
        this.contaLoja = new Conta(0); // Saldo inicial da loja é zero
    }

    public synchronized void pagarSalario(Funcionario funcionario) {
        contaLoja.sacar(salarioFuncionario);
        funcionario.receberSalario(salarioFuncionario);
        System.out.println("Salário pago para o funcionário na loja " + nome);
    }

    public Conta getConta() {
        return contaLoja;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
