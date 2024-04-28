Sistema Bancário
Este é um projeto que simula um sistema bancário com entidades como banco, lojas, funcionários e clientes. O sistema foi implementado em Java (versão 17) e utiliza threads para simular operações assíncronas.

---
Classes
---
Banco
A classe Banco representa a entidade bancária responsável por intermediar as transações entre contas. Utiliza o padrão Singleton para garantir uma única instância do banco durante a execução do programa.

Métodos:
getInstance(): Retorna a instância única do banco.
transferir(Conta origem, Conta destino, double valor): Realiza uma transferência entre contas.
---
Loja
A classe Loja representa uma loja do sistema. Cada loja possui uma conta para receber pagamentos dos clientes e pagar os salários dos funcionários.

Atributos:
nome: Nome da loja.
contaLoja: Conta da loja.
salarioFuncionario: Salário dos funcionários da loja.
Métodos:
pagarSalario(Funcionario funcionario): Paga o salário de um funcionário da loja.
getConta(): Retorna a conta da loja.
getNome(): Retorna o nome da loja.
setNome(String nome): Define o nome da loja.
---
Funcionario
A classe Funcionario representa um funcionário que trabalha em uma loja. Cada funcionário possui uma conta de salário e uma conta de investimento.

Atributos:
contaSalario: Conta de salário do funcionário.
contaInvestimento: Conta de investimento do funcionário.
percentualInvestimento: Percentual do salário que é investido.
Métodos:
receberSalario(double salario): Recebe o salário e realiza investimento.
getContaSalario(): Retorna a conta de salário do funcionário.
run(): Método executado pela thread do funcionário.
----
Cliente
A classe Cliente representa um cliente do sistema bancário. Cada cliente possui uma conta com saldo inicial para realizar compras nas lojas.

Atributos:
conta: Conta do cliente.
lojas: Array de lojas disponíveis para compras.
Métodos:
realizarCompras(): Simula compras do cliente em lojas alternadas.
getConta(): Retorna a conta do cliente.
run(): Método executado pela thread do cliente.
---
Conta
A classe Conta representa uma conta bancária com saldo e operações de depósito e saque. Utiliza um Lock para garantir a consistência das operações em ambientes multi-thread.

Atributos:
saldo: Saldo da conta.
lock: Lock para operações de depósito e saque.
Métodos:
getSaldo(): Retorna o saldo da conta.
depositar(double valor): Realiza um depósito na conta.
sacar(double valor): Realiza um saque na conta.
Execução
Para executar o sistema bancário:
---
*Execução*
Para executar o sistema bancário:

Certifique-se de ter o Java JDK 17 instalado em seu sistema.
Compile todas as classes Java
Execute a classe SistemaBancario utilizando o comando java SistemaBancario.
Acompanhe a execução das operações no console.
Verifique o saldo das contas após as operações.
