package entities;

public class Banco {
    private static Banco instance;
    private final Conta contaBanco;

    private Banco() {
        contaBanco = new Conta(0); // O saldo inicial do banco é zero
    }

    public static synchronized Banco getInstance() {
        if (instance == null) {
            instance = new Banco();
        }
        return instance;
    }

    public synchronized void transferir(Conta origem, Conta destino, double valor) {
        origem.sacar(valor);
        destino.depositar(valor);
        System.out.println("Transferência de " + valor + " realizada.");
    }

    public Conta getContaBanco() {
        return contaBanco;
    }
}