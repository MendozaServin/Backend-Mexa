package a.lo.mexa.backend.controller;

import a.lo.mexa.backend.dto.UserDTO;
import a.lo.mexa.backend.dto.foods.HotFoodsDTO;
import a.lo.mexa.backend.exception.BusinessException;
import a.lo.mexa.backend.model.*;
import a.lo.mexa.backend.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping(value = "/api/1")
public class ApplicationController {

    @Autowired
    ApplicationService applicationService;

    @CrossOrigin(origins = "http://localhost:4200")
    @ExceptionHandler({ BusinessException.class })
    @ResponseBody
    public ResponseEntity<String> userHandler(BusinessException ex) {
        return new ResponseEntity<>(ex.getMessage(), ex.getHttpStatus());
    }

    //----- USER -----

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/addnewuser", method = RequestMethod.POST)
    public ResponseEntity<User> createuser(@RequestBody User user){
        User usr = applicationService.addUser(user);
        return new ResponseEntity(usr, HttpStatus.CREATED);
    }

    //--------------- POST ---------------

    //----- FOODS -----

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/addHFood", method = RequestMethod.POST)
    public ResponseEntity<HotFood> addHotFood(@RequestBody HotFood hotFood){
        HotFood hFood = applicationService.addHotFood(hotFood);
        return new ResponseEntity(hFood, HttpStatus.CREATED);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/addCFood", method = RequestMethod.POST)
    public ResponseEntity<ColdFood> addColdFood(@RequestBody ColdFood coldFood){
        ColdFood cFood = applicationService.addColdFood(coldFood);
        return new ResponseEntity(cFood, HttpStatus.CREATED);
    }

    //----- DRINKS -----

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/addHDrink", method = RequestMethod.POST)
    public ResponseEntity<HotDrink> addHotDrink(@RequestBody HotDrink hotDrink){
        HotDrink hDrink = applicationService.addHotDrink(hotDrink);
        return new ResponseEntity(hDrink, HttpStatus.CREATED);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/addCDrink", method = RequestMethod.POST)
    public ResponseEntity<ColdDrink> addColdDrink(@RequestBody ColdDrink coldDrink){
        ColdDrink cDrink = applicationService.addColdDrink(coldDrink);
        return new ResponseEntity(cDrink, HttpStatus.CREATED);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/addADrink", method = RequestMethod.POST)
    public ResponseEntity<AlcoholDrink> addAlcoholDrink(@RequestBody AlcoholDrink alcoholDrink){
        AlcoholDrink aDrink = applicationService.addAlcoholDrink(alcoholDrink);
        return new ResponseEntity(aDrink, HttpStatus.CREATED);
    }

    //----- DESSERTS -----

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/addD", method = RequestMethod.POST)
    public ResponseEntity<Dessert> addDessert(@RequestBody Dessert dessert){
        Dessert dD = applicationService.addDessert(dessert);
        return new ResponseEntity(dD, HttpStatus.CREATED);
    }

    //--------------- GET ---------------

    //----- FOODS ------

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/getHFood", method = RequestMethod.GET)
    public ResponseEntity<HotFood> gHF(){
        List<HotFood> hotF = applicationService.gHF();
        return new ResponseEntity(hotF, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/getCFood", method = RequestMethod.GET)
    public ResponseEntity<ColdFood> gCF(){
        List<ColdFood> coldF = applicationService.gCF();
        return new ResponseEntity(coldF, HttpStatus.OK);
    }

    //----- DRINKS -----

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/getHDrink", method = RequestMethod.GET)
    public ResponseEntity<HotDrink> gHD(){
        List<HotDrink> hotD = applicationService.gHD();
        return new ResponseEntity(hotD, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/getCDrink", method = RequestMethod.GET)
    public ResponseEntity<ColdDrink> gCD(){
        List<ColdDrink> coldD = applicationService.gCD();
        return new ResponseEntity(coldD, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/getADrink", method = RequestMethod.GET)
    public ResponseEntity<AlcoholDrink> gAD(){
        List<AlcoholDrink> alcoholD = applicationService.gAD();
        return new ResponseEntity(alcoholD, HttpStatus.OK);
    }

    //----- DESSERTS -----

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/getD", method = RequestMethod.GET)
    public ResponseEntity<Dessert> gD(){
        List<Dessert> dessertD = applicationService.gD();
        return new ResponseEntity(dessertD, HttpStatus.OK);
    }
}