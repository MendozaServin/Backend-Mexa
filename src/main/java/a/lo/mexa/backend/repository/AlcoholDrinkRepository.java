package a.lo.mexa.backend.repository;

import a.lo.mexa.backend.model.AlcoholDrink;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface AlcoholDrinkRepository extends CrudRepository<AlcoholDrink, Integer> {
}
