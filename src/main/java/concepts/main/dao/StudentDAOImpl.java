package concepts.main.dao;

import concepts.main.entities.SpringStudent;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class StudentDAOImpl implements StudentDAO{
    //define field for EntityManager
    private EntityManager entityManager;

    //define field for Entity Manager using constructor injection

    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    //implement save
    @Override
    @Transactional
    public void save(SpringStudent theStudent){
        entityManager.persist(theStudent);
    }
}
