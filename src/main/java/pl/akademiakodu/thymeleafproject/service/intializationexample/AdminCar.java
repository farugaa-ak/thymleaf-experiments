package pl.akademiakodu.thymeleafproject.service.intializationexample;

public class AdminCar {

    public static void main(String[] args) {
        //by constructor
        Car fiat = new Car("fiat", "991343");
        fiat.setName("audi");



        for (int i = 0; i < 100; i++) {

        }


        //by setter
        Car bmw = new Car();
        bmw.getName().isEmpty();// NullPointerException



        bmw.setName("bmw");
        System.out.println(bmw);
    }
}
