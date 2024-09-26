package testeBasico.UmPraUm;

import infra.DAO;
import modeloUmPraUm.Assento;
import modeloUmPraUm.Cliente;

public class NovoClienteAssento1 {
    public static void main(String[] args) {

        Assento assento = new Assento("23F");
        Cliente cliente = new Cliente("Bia", assento);

        DAO<Object> dao = new DAO<>();

        dao.abrirT()
                .incluir(assento)
                .incluir(cliente)
                .fehcarT()
                .fechar();

    }
}
