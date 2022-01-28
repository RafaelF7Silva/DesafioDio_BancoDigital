


import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter @Setter
public class BancoDio extends Cliente{

    public BancoDio(String nome, String email, String endereco, String dataNascimento, int cpf) {
        super(nome, email, endereco, dataNascimento, cpf);

    }

    ArrayList <Cliente> clientes = new ArrayList<Cliente>();

    Cliente cliente01  = new Cliente
            ("Rafael Silva", "rafa@bol.com", "Rua 15 de abril", "11/11/1988", 333333333);

    Cliente cliente02 = new Cliente
            ("Maria Silva", "maria@bol.com", "Rua das Pedras SN ", "10/10/1975", 335533333);


    Cliente cliente03= new Cliente
            ("Ana Lucia", "maria@gmial.com", "Avenida SN ", "25/05/1995", 335535233);
}

