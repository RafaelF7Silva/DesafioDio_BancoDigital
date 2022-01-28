import lombok.Getter;
import lombok.Setter;


@Getter  @Setter
public class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    private double saldo;
    protected Cliente cliente;
    private double limite;


    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {

        if(valor <= this.saldo) {
            this.saldo = this.saldo - valor;
            System.out.println("Saque realizado com sucesso");
        }else if(valor <= (this.saldo + this.limite)){
            double val_ret = this.saldo - valor;
            if(val_ret < 0) {
                this.saldo = 0;
            }
            System.out.println("Saque realizado com sucesso");
        }else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimirExtrato() {
    }



    public Conta(double saldo) {

        this.saldo = saldo;
    }

     public void sacar() {
    }

    public void depositar() {
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));

    }
    private static void MeusDados() {
    }

    private static void consultarsaldo() {
    }

    private static void imprime() {
    }

}



