package infra;

import modeloBasico.Produto;

public class ProdutoDAO extends DAO<Produto>{

    public ProdutoDAO(){
        super(Produto.class);
    }
}
