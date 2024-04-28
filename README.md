# Sistema Bancário

`Este projeto simula um sistema bancário com entidades como banco, lojas, funcionários e clientes. Utiliza Java (versão 17) e threads para operações assíncronas.`

## Classes

### Banco

Responsável pela intermediação de transações entre contas.

#### Métodos:

- `getInstance()`: Retorna a instância única do banco.
- `transferir(Conta origem, Conta destino, double valor)`: Realiza transferência entre contas.

### Loja

Representa uma loja com conta para pagamentos e salários de funcionários.

#### Métodos:

- `pagarSalario(Funcionario funcionario)`: Paga salário de um funcionário.
- `getConta()`: Retorna conta da loja.
- `getNome()`, `setNome(String nome)`: Manipula nome da loja.

### Funcionario

Representa um funcionário com conta de salário e investimento.

#### Métodos:

- `receberSalario(double salario)`: Recebe e investe salário.
- `getContaSalario()`: Retorna conta de salário.
- `run()`: Executa operações do funcionário.

### Cliente

Representa um cliente com conta para compras em lojas.

#### Métodos:

- `realizarCompras()`: Simula compras do cliente.
- `getConta()`: Retorna conta do cliente.
- `run()`: Executa operações do cliente.

### Conta

Representa uma conta bancária.

#### Métodos:

- `getSaldo()`: Retorna saldo da conta.
- `depositar(double valor)`, `sacar(double valor)`: Operações de depósito e saque.

## Execução

1. Compile as classes.
2. Execute `SistemaBancario.java` para iniciar o sistema.
3. Acompanhe as operações no console.
4. Verifique os saldos das contas após operações.

