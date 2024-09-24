package testeBasico;

import modeloBasico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuario2 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario usuario = em.find(Usuario.class, 7L);
        usuario.setNome("Priftis alterado");
        usuario.setEmail("priftis@gmail.com.br");


        //merge é responsavel por pegar um usuario que ja esta no banco
        //ou um objeto que ja esta no banco e fazer a alteraçao ou melhor, um update
        //em.merge(usuario);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
