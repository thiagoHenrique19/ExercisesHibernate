package testeBasico;

import modeloBasico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuario3 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();//associa com o banco de dados e consegue fazer updates

        Usuario usuario = em.find(Usuario.class, 7L);
        usuario.setNome("Priftis");
        usuario.setEmail("priftis@gmail.com.br");
        //em.detach(usuario);
        //  funcao que tira o objeto do seu estado gerenciado, ah não ser
        // que o merge esteja sendo utilizado ai ele volta para o estado gerenciado e faz as alteracoes

        //em.merge(usuario);
        //merge é responsavel por pegar um usuario que ja esta no banco
        //ou um objeto que ja esta no banco e fazer a alteraçao ou melhor, um update

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}