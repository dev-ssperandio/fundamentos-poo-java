package pacotes.escola;

public class Escola {
    public static void main(String[] args) {
        Aluno sidney = new Aluno();
        sidney.setNome("Sidney Sperandio");;
        sidney.setIdade(28);

        System.out.println("O aluno " + sidney.getNome() + " tem " + sidney.getIdade() + " anos");
        
    }
}
