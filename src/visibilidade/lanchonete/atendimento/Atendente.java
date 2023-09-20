package visibilidade.lanchonete.atendimento;

public class Atendente {
    public void servindoMesa() {
        pegarLancheCozinha();;
        System.out.println("ADICIONANDO LANCHE NATURAL HAMBURGER NO BALCAO");
    }

    private void pegarLancheCozinha() {
        System.out.println("PEGANDO LANCHE NA COZINHA");
    }

    public void receberPagamento() {
        System.out.println("RECEBENDO PAGAMENTO");
    }

    void trocarGas() {
        System.out.println("ATENDENTE TROCANDO GAS");
    }

    private void pegarPeidoBalcao() {
        System.out.println("PEGANDO PEDIDO NO BALCAO");
    }
}
