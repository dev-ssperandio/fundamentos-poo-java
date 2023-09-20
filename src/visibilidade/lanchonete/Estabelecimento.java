package visibilidade.lanchonete;

import visibilidade.lanchonete.area.cliente.Cliente;
import visibilidade.lanchonete.atendimento.Atendente;
import visibilidade.lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        // ações que o estabelecimento precisa ter ciência
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();
        
        Atendente atendente = new Atendente();
        atendente.servindoMesa();
        atendente.receberPagamento();

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();        
    }
    
}
