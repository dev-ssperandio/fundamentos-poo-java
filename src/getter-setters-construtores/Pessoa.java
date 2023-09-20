public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    // método constrututor
    // o nome do método deverá ser igual ao nome da classe 
    public Pessoa (String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    //...
    // e os setters de nome e cpf?
    
}
