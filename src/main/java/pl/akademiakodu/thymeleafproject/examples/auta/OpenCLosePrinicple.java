package pl.akademiakodu.thymeleafproject.examples.auta;

import java.util.ArrayList;
import java.util.List;

public class OpenCLosePrinicple {


    public static void main2(String[] args) {
        List<Auto> autoList = new ArrayList<>();

        autoList.add(new Audi());
        autoList.add(new VW());
        autoList.add(new BMW());


        Magasine magasine = new Magasine();
        magasine.runAllCars(autoList);
    }

    public synchronized void theSameSynchronizedMethod(){

    }

    public void theSameSynchronizedMethod2(){
        synchronized (this){



        }
    }


    static interface Ship {
        void go();
    }

    static public class MarineShip implements Ship {
        public void go() {
            System.out.println("Sea surface");
        }
    }

    static class Submarine extends MarineShip{
        public void go() {
            System.out.println("Underwater");
        }
    }



    public static void main(String[] args) {
        MarineShip submarine = new Submarine();
        submarine.go();
    }


    public static void me(){
    }
}