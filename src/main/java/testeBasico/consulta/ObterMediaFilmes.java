package testeBasico.consulta;

import infra.DAO;
import modeloConsulta.NotaFilme;
import modeloMuitosPraMuitos.Filme;

public class ObterMediaFilmes {
    public static void main(String[] args) {

        DAO<NotaFilme> dao = new DAO<>(NotaFilme.class);
        NotaFilme nota = dao.consultarUm("obterMediaGeralDosFilmes");

        System.out.println(nota.getMedia());

        dao.fechar();
    }
}
