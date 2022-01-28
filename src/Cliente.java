import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Cliente {

    private String nome;
    private String email;
    private String endereco;
    private String dataNascimento;
    private int cpf;

    public Cliente(String nome, String email, String endereco, String dataNascimento, int cpf) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public Cliente() {

    }


    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", endereco='" + endereco + '\'' +
                ", cpf=" + cpf +
                '}';
    }
}




