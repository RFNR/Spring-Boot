    package com.cursojava.curso.dao;

    import com.cursojava.curso.models.Usuario;
    import org.springframework.stereotype.Repository;
    import org.springframework.transaction.annotation.Transactional;

    import javax.persistence.EntityManager;
    import javax.persistence.PersistenceContext;
    import java.util.List;
    @Repository // -> Ver 2_Nota_Repository
    @Transactional // Ver 3_Nota_Transactional
    public class UsuarioDaoImp implements UsuarioDao{
        @PersistenceContext // -> Ver EntityManager y PersistenceContext en 4_Nota_Entity_Persistence
        private EntityManager entityManager;
        @Override
        public List<Usuario> getUsuarios() {
            String query = "FROM Usuario";
            List<Usuario> resultado = entityManager.createQuery(query).getResultList();
            return resultado;
        }


    }
