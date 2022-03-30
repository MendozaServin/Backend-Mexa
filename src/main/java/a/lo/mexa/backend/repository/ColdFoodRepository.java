package a.lo.mexa.backend.repository;

import a.lo.mexa.backend.model.ColdFood;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface ColdFoodRepository extends CrudRepository<ColdFood, Integer> {
}
