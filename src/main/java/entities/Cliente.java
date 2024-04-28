package entities;

import java.util.Random;

public class Cliente implements Runnable {
    private final Conta conta;
    private final Loja[] lojas;
    private final Random random;

    public Cliente(double saldoInicial, Loja[] lojas) {
        this.conta = new Conta(saldoInicial);
        this.lojas = lojas;
        this.random = new Random();
    }

    public void realizarCompras() {
        while (conta.getSaldo() >= 100) { // Enquanto houver saldo para comprar
            int indiceLoja = random.nextInt(lojas.length); // Escolher uma loja aleatoriamente
            double valorCompra = random.nextDouble() <= 0.5 ? 100 : 200; // Comprar R$ 100 ou R$ 200 aleatoriamente
            Loja loja = lojas[indiceLoja];
            if (conta.getSaldo() >= valorCompra) { // Verificar se há saldo suficiente para a compra
                conta.sacar(valorCompra); // Sacar o valor da compra da conta
                loja.getConta().depositar(valorCompra); // Depositar o valor da compra na conta da loja
                System.out.println("Cliente comprou R$ " + valorCompra + " na loja " + loja.getNome());
            }
        }
    }

    @Override
    public void run() {
        realizarCompras();
    }

    public Conta getConta() {
        return conta;
    }
}
