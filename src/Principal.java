import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {


        Cliente Rafael = new Cliente
                 ("Rafael Silva", "rafa@bol.com", "Rua 15 de abril", "11/11/1988", 333333333);
        Conta conta = new Conta(200);
        Conta cc = new ContaCorrente(Rafael);
        Conta poupanca = new ContaPoupanca(Rafael);



        Scanner teclado = new Scanner(System.in);
        int opcao = 0;


        System.out.println("Bem-vindo ao Banco Dio");
        do {
            System.out.println("Selecione uma opção abaixo: ");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("4 - Meus dados");
            System.out.println("5 - Dados Poupança");
            System.out.println("0 - Sair");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    conta.depositar();
                    System.out.println("============ Depósito=============");
                    System.out.println("Informe o valor para deposito: ");
                    double valor = teclado.nextFloat();
                    if (valor > 0) {
                        conta.depositar(valor);
                        System.out.println("Depósito efetuado com sucesso.");
                    } else {
                        System.out.println("O valor precisa ser positivo.");
                    }
                    break;
                case 2:
                    conta.sacar();
                    conta.depositar();
                    System.out.println("============ Saque,=============");
                    System.out.println("Informe o valor para saque: ");
                    valor = teclado.nextFloat();
                    if (valor > 0) {
                        conta.sacar(valor);
                        System.out.println("saque efetuado com sucesso.");
                    } else {
                        System.out.println("O valor precisa ser positivo.");
                    }
                    break;
                case 3:
                    extrato();
                    System.out.println("Seu saldo " + conta.getSaldo());
                      break;
                case 4:
                    Meusdados();
                    cc.imprimirExtrato();
                    System.out.println("Seu saldo da conta corrente é: " + conta.getSaldo());
                break;

                    case 5:
                    DadosPoupanca();
                    poupanca.imprimirExtrato();
                    System.out.println("Seu saldo da poupança Dio é : " + conta.getSaldo());

                    break;

                case 0:
                    break;
                default:
                    System.out.println("Opção Invalida");
                    break;
                }
            } while (opcao > 0) ;
            teclado.close();
        }

    private static void DadosPoupanca() {
    }

    private static void Meusdados() {
    }

    private static void extrato() {
    }

}


