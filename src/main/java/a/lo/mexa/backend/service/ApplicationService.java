package a.lo.mexa.backend.service;

import a.lo.mexa.backend.dto.foods.HotFoodsDTO;
import a.lo.mexa.backend.model.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ApplicationService {

    User addUser(User userModel);

    HotFood addHotFood(HotFood hotFood);

    ColdFood addColdFood(ColdFood coldFood);

    HotDrink addHotDrink(HotDrink hotDrink);

    ColdDrink addColdDrink(ColdDrink coldDrink);

    AlcoholDrink addAlcoholDrink(AlcoholDrink alcoholDrink);

    Dessert addDessert(Dessert dessert);

    List<HotFood> gHF();

    List<ColdFood> gCF();

    List<HotDrink> gHD();

    List<ColdDrink> gCD();

    List<AlcoholDrink> gAD();

    List<Dessert> gD();
}
