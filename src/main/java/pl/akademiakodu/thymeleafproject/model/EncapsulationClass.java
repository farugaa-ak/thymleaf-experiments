package pl.akademiakodu.thymeleafproject.model;

public class EncapsulationClass {


    public static void main(String[] args) {
        Person person = new Person();
        person.getEmotions();
    }
}


class Emotions {}

class Person{

    private Emotions emotions;

    public Emotions getEmotions(){
        return  emotions;
    }
}
