package pl.akademiakodu.thymeleafproject.service.intializationexample;

public class Car {

    private String name;
    private String price;


    public Car(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public Car() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
