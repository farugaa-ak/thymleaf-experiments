package pl.akademiakodu.thymeleafproject.service.intializationexample;

public class Person {

    private String heart;

    public Person(String heart) {
        this.heart = heart;
    }


    public String getHeart() {
        return heart;
    }

    public static void main(String[] args) {
        Person person = new Person("heart2");

        person.getHeart();
    }
}
