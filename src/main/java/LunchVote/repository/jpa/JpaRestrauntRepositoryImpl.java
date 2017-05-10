package LunchVote.repository.jpa;

import LunchVote.model.Dish;
import LunchVote.model.Restraunt;
import LunchVote.repository.RestrauntRepositoy;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.LocalDate;
import java.util.List;

/**
 * Created by evgeniy on 10.05.2017.
 */
@Repository
@Transactional(readOnly = true)
public class JpaRestrauntRepositoryImpl implements RestrauntRepositoy {

    @PersistenceContext
    private EntityManager em;


    @Override
    public List<Dish> getAllDishesByDate(LocalDate date) {
        return null;
    }

    @Override
    public Restraunt get(int id) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public Restraunt save(Restraunt restraunt) {
        return null;
    }

    @Override
    public List<Restraunt> getAll() {
        return null;
    }

    @Override
    public List<Restraunt> getAllWithTodayMenu(LocalDate date) {
        return em.createNamedQuery(Restraunt.ALL_BY_TODAY, Restraunt.class)
                .setParameter("date", date)
                .getResultList();
    }
}
