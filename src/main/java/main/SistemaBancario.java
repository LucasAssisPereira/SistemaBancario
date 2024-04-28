package main;
import entities.*;

public class SistemaBancario {
    public static void main(String[] args) {
        // Criar instância do banco
        Banco banco = Banco.getInstance();

        // Criar instâncias das lojas
        Loja loja1 = new Loja();
        loja1.setNome("Loja Knout");
        Loja loja2 = new Loja();
        loja2.setNome("Loja FB");

        // Criar instâncias dos funcionários
        Funcionario funcionario1 = new Funcionario(1400.0);
        Funcionario funcionario2 = new Funcionario(1400.0);

        // Criar instâncias dos clientes
        Loja[] lojas = {loja1, loja2};
        Cliente cliente1 = new Cliente(1000.0, lojas);
        Cliente cliente2 = new Cliente(1000.0, lojas);
        Cliente cliente3 = new Cliente(1000.0, lojas);
        Cliente cliente4 = new Cliente(1000.0, lojas);
        Cliente cliente5 = new Cliente(1000.0, lojas);
        System.out.println("------------------------------------------------------------------");
        // Iniciar threads para funcionários e clientes
        Thread threadFuncionario1 = new Thread(funcionario1);
        Thread threadFuncionario2 = new Thread(funcionario2);
        Thread threadCliente1 = new Thread(cliente1);
        Thread threadCliente2 = new Thread(cliente2);
        Thread threadCliente3 = new Thread(cliente3);
        Thread threadCliente4 = new Thread(cliente4);
        Thread threadCliente5 = new Thread(cliente5);

        threadFuncionario1.start();
        threadFuncionario2.start();
        threadCliente1.start();
        threadCliente2.start();
        threadCliente3.start();
        threadCliente4.start();
        threadCliente5.start();

        try {
            threadFuncionario1.join();
            threadFuncionario2.join();
            threadCliente1.join();
            threadCliente2.join();
            threadCliente3.join();
            threadCliente4.join();
            threadCliente5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("------------------------------------------------------------------");

        // Exibir saldo das contas após as operações
        System.out.println("Saldo da conta do banco: R$ " + banco.getContaBanco().getSaldo());
        System.out.println("Saldo da conta da loja 1: R$ " + loja1.getConta().getSaldo());
        System.out.println("Saldo da conta da loja 2: R$ " + loja2.getConta().getSaldo());
        System.out.println("Saldo da conta do funcionário 1: R$ " + funcionario1.getContaSalario().getSaldo());
        System.out.println("Saldo da conta do funcionário 2: R$ " + funcionario2.getContaSalario().getSaldo());
        System.out.println("Saldo da conta do cliente 1: R$ " + cliente1.getConta().getSaldo());
        System.out.println("Saldo da conta do cliente 2: R$ " + cliente2.getConta().getSaldo());
        System.out.println("Saldo da conta do cliente 3: R$ " + cliente3.getConta().getSaldo());
        System.out.println("Saldo da conta do cliente 4: R$ " + cliente4.getConta().getSaldo());
        System.out.println("Saldo da conta do cliente 5: R$ " + cliente5.getConta().getSaldo());
    }
}