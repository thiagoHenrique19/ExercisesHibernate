package testeBasico.UmPraMuitos;

import infra.DAO;
import modeloBasico.Produto;
import modeloUmPraMuitos.ItemPedido;
import modeloUmPraMuitos.Pedido;

public class NovoPedido {
    public static void main(String[] args) {

        DAO<Object> dao = new DAO<>();

        Produto produto = new Produto("Geladeira", 2789.99);
        Pedido pedido = new Pedido();
        ItemPedido item = new ItemPedido(pedido,produto,10);

        dao.abrirT()
                .incluir(produto)
                .incluir(pedido)
                .incluir(item)
                .fehcarT()
                .fechar();
    }
}
