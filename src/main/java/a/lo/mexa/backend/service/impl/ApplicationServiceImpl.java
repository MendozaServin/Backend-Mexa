package a.lo.mexa.backend.service.impl;


import a.lo.mexa.backend.model.*;
import a.lo.mexa.backend.repository.*;
import a.lo.mexa.backend.service.ApplicationService;
import a.lo.mexa.backend.service.HttpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApplicationServiceImpl implements ApplicationService {
    @Autowired
    HttpService httpService;

    @Autowired
    UserRepository userRepository;

    @Autowired
    HotFoodRepository hotFoodRepository;

    @Autowired
    ColdFoodRepository coldFoodRepository;

    @Autowired
    HotDrinkRepository hotDrinkRepository;

    @Autowired
    ColdDrinkRepository coldDrinkRepository;

    @Autowired
    AlcoholDrinkRepository alcoholDrinkRepository;

    @Autowired
    DessertRepository dessertRepository;

    //----- User -----

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    //-------------------- POST --------------------

    //----- FOODS -----

    @Override
    public HotFood addHotFood(HotFood hotFood){return hotFoodRepository.save(hotFood); }

    @Override
    public ColdFood addColdFood(ColdFood coldFood){return coldFoodRepository.save(coldFood); }

    //----- DRINKS -----

    @Override
    public HotDrink addHotDrink(HotDrink hotDrink){return hotDrinkRepository.save(hotDrink);}

    @Override
    public ColdDrink addColdDrink(ColdDrink coldDrink){return coldDrinkRepository.save(coldDrink);}

    @Override
    public AlcoholDrink addAlcoholDrink(AlcoholDrink alcoholDrink){return alcoholDrinkRepository.save(alcoholDrink); }

    //----- Desserts -----

    @Override
    public Dessert addDessert(Dessert dessert){return dessertRepository.save(dessert);}




    //-------------------- GET --------------------

    //----- FOODS -----

    @Override
    public List<HotFood> gHF() {
        Iterable<HotFood> hotFoods = hotFoodRepository.findAll();
        List<HotFood> hotFoods1 = new ArrayList<HotFood>();
        hotFoods.forEach(hotFoods1::add);
        return hotFoods1;
    }

    @Override
    public List<ColdFood> gCF() {
        Iterable<ColdFood> coldFoods = coldFoodRepository.findAll();
        List<ColdFood> coldFoods1 = new ArrayList<ColdFood>();
        coldFoods.forEach(coldFoods1::add);
        return coldFoods1;
    }

    //----- DRINKS -----

    @Override
    public List<HotDrink> gHD() {
        Iterable<HotDrink> hotDrinks = hotDrinkRepository.findAll();
        List<HotDrink> hotDrinks1 = new ArrayList<HotDrink>();
        hotDrinks.forEach(hotDrinks1::add);
        return hotDrinks1;
    }

    @Override
    public List<ColdDrink> gCD() {
        Iterable<ColdDrink> coldDrinks = coldDrinkRepository.findAll();
        List<ColdDrink> coldDrinks1 = new ArrayList<ColdDrink>();
        coldDrinks.forEach(coldDrinks1::add);
        return coldDrinks1;
    }

    @Override
    public List<AlcoholDrink> gAD() {
        Iterable<AlcoholDrink> alcoholDrinks = alcoholDrinkRepository.findAll();
        List<AlcoholDrink> alcoholDrinks1 = new ArrayList<AlcoholDrink>();
        alcoholDrinks.forEach(alcoholDrinks1::add);
        return alcoholDrinks1;
    }

    //----- DESSERTS -----

    @Override
    public List<Dessert> gD() {
        Iterable<Dessert> desserts = dessertRepository.findAll();
        List<Dessert> desserts1 = new ArrayList<Dessert>();
        desserts.forEach(desserts1::add);
        return desserts1;
    }
}