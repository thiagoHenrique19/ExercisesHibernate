package testeBasico.UmPraUm;

import infra.DAO;
import modeloUmPraUm.Assento;
import modeloUmPraUm.Cliente;

public class NovoClienteAssento2 {
    public static void main(String[] args) {

        Assento assento = new Assento("4D");
        Cliente cliente = new Cliente("Rodrigo", assento);

        DAO<Cliente> dao = new DAO<Cliente>(Cliente.class);
        dao.incluirAtomico(cliente);
    }
}
