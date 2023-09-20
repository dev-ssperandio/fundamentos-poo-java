public class SistemaCadastro {
    public static void main(String[] args) {
        // criamos uma pessoa no sistema
        Pessoa sidney = new Pessoa("123.456.789-00", "Sidney Sperandio");

        // definimos o endereço
        sidney.setEndereco("RUA GENERAL GOES MONTEIRO");

        // e como definir o nome e cpf sem os respectivos métodos setters?

        // imprimindo a pessoa sem nome e cpf
        System.out.println(sidney.getNome() + "-" + sidney.getCpf());
    }
}
