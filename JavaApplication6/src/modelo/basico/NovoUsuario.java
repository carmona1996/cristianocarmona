package modelo.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NovoUsuario {
    public static void main(String[] args){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("sistemaconnect");
        EntityManager em = emf.createEntityManager();
        
        Usuario novoUsuario = new Usuario("Djalminha","djalma@Lanche.com.br");
        
        novoUsuario.setId(1L);
        
        em.persist(novoUsuario);
        
        em.close();
        emf.close();
    }
    
}
