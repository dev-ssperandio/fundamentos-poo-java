package visibilidade.lanchonete.atendimento.cozinha;

public class Cozinheiro {
    // pode ser default
    public void adicionarLancheNoBalcao() {
        System.out.println("ADICIONANDO LANCHE NATURAL HAMBURGER NO BALCAO");
    }
    
    // pode ser default
    public void adicionarSucoNoBalcao() {
        System.out.println("ADICIONANDO SUCO NO BALCAO");
    }
    
    // pode ser default
    public void adicionarComboNoBalcao() {
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    private void prepararLanche() {
        System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER");
    }

    private void prepararVitamina() {
        System.out.println("PREPARANDO VITAMINA");
    }
    
    private void pedirParaTrocarGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    }

    private void pedirIgredientes(Almoxarife almoxarife) {
        almoxarife.entregarIgredientes();
    }
}
