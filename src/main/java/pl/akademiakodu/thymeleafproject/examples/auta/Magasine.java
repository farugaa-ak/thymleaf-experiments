package pl.akademiakodu.thymeleafproject.examples.auta;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Magasine {

    public void runAllCars(List<Auto> auta){
        System.out.println("====== start magasine");
        for (Auto auto : auta) {
            auto.run();
        }
        System.out.println("====== end magasine");
    }
}
