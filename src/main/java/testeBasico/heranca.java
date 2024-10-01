package testeBasico;

import infra.DAO;
import modeloHeranca.Aluno;
import modeloHeranca.AlunoBolsista;

public class heranca {
    public static void main(String[] args) {

        DAO<Aluno> alunoDAO = new DAO<>();

        Aluno aluno1 = new Aluno(123L, "Joao");
        AlunoBolsista aluno2 = new AlunoBolsista(345L, "Maria", 1000.0);

        alunoDAO.incluirAtomico(aluno1);
        alunoDAO.incluirAtomico(aluno2);

        alunoDAO.fechar();
    }
}
