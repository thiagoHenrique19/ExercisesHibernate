package testeBasico;

import infra.DAO;
import modeloBasico.Produto;

public class NovoProduto {
    public static void main(String[] args) {

        Produto produto = new Produto("Monitor 23", 789.98);

        DAO<Produto> dao = new DAO<>(Produto.class);
        dao.incluirAtomico(produto).fechar();//ou essa mais simples
        //dao.abrirT().incluir(produto).fehcarT().fechar();//da pra utilizar dessa maneira para cadastrar um produto
    }
}
