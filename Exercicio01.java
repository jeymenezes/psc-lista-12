package ListadeExercíciosVII;

public class Exercicio01 {
    public class ContaBancaria {

        private String numeroConta;
        private String titular;
        private double saldo;

        // ----------------- GETTERS -----------------

        public String getNumeroConta() {
            return numeroConta;
        }

        public String getTitular() {
            return titular;
        }

        public double getSaldo() {
            return saldo; // saldo é somente leitura
        }

        // ----------------- SETTERS -----------------

        public void setNumeroConta(String numeroConta) {
            if (numeroConta == null || numeroConta.isEmpty()) {
                System.out.println("Erro: Número da conta não pode ser nulo ou vazio.");
            } else {
                this.numeroConta = numeroConta;
            }
        }

        public void setTitular(String titular) {
            if (titular == null || titular.isEmpty()) {
                System.out.println("Erro: Nome do titular não pode ser nulo ou vazio.");
            } else {
                this.titular = titular;
            }
        }

        // ----------------- MÉTODOS DE TRANSAÇÃO -----------------

        public void depositar(double valor) {
            if (valor > 0) {
                saldo += valor;
                System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
            } else {
                System.out.println("Erro: Valor de depósito inválido.");
            }
        }

        public void sacar(double valor) {
            if (valor <= 0) {
                System.out.println("Erro: Valor de saque inválido.");
            }
            else if (valor > saldo) {
                System.out.println("Erro: Saldo insuficiente para saque.");
            }
            else {
                saldo -= valor;
                System.out.println("Saque de R$" + valor + " realizado com sucesso!");

                public class TesteEncapsulamento {

                    public static void main(String[] args) {

                        ContaBancaria conta = new ContaBancaria();

                        // 2. Tentativa de acessar atributos diretamente (vai dar erro)
                        // conta.saldo = 500;   // ERRO de compilação: saldo é private
                        // conta.numeroConta = "123"; // ERRO
                        // conta.titular = "Maria";   // ERRO

                        // 3. Inicializando os atributos com setters
                        conta.setNumeroConta("12345-9");
                        conta.setTitular("Maria Silva");

                        // 4. Testando depósitos e saques
                        conta.depositar(800);      // correto
                        conta.depositar(-50);      // erro

                        conta.sacar(200);          // correto
                        conta.sacar(1000);         // erro: saldo insuficiente
                        conta.sacar(-10);          // erro: valor inválido

                        // 5. Exibindo saldo final
                        System.out.println("Saldo final: R$" + conta.getSaldo());
                    }
                }

            }

        }
        }
    }

}
