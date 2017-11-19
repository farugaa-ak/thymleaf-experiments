package pl.akademiakodu.thymeleafproject.examples;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class MainExamples {

    public static void main(String[] args) {
        List<String> strings = new CopyOnWriteArrayList<>();
        Set<String> stringSet = new CopyOnWriteArraySet<>();


        Map<String, String> maps = new HashMap<>();


        Map<Dziadek, String> maps2 = new HashMap<>();

        maps2.put(new Dziadek("pierwszy"), "Jan");
        maps2.put(new Dziadek("drugi"), "Janusza");

        String pierwszy = maps2.get(new Dziadek("pierwszy"));
        pierwszy.equals("Jan");


    }
}


class Dziadek {
    private String madrosc;

    public String getMadrosc() {
        return madrosc;
    }

    public Dziadek(String madrosc) {
        this.madrosc = madrosc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dziadek dziadek = (Dziadek) o;
        return Objects.equals(madrosc, dziadek.madrosc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(madrosc);
    }
}

class Ojciec {
    private String sila;

    public String getSila() {
        return sila;
    }
}

class Wnuk {

    private Dziadek dziadek;
    private Ojciec ojciec;

    protected String lekkomyslnosc;

    void testThis() {
        dziadek.getMadrosc();
        ojciec.getSila();
    }
}


class ExampleMethod {

    //adnotacja rozszerza konfigurowalnosc metody/klasy
    public String methodName() {
        String nazwa = "nazwa";
        return "GETMAPPING:/url" + nazwa;
    }


    public Pair methodName(String argument1) {
        return new Pair("napis", 34);
    }
}




class Pair {
    private final String napis;
    private final Integer liczba;

    public Pair(String napis, Integer liczba) {
        this.napis = napis;
        this.liczba = liczba;
    }

    public String getNapis() {
        return napis;
    }

    public Integer getLiczba() {
        return liczba;
    }
}

