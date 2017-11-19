package pl.akademiakodu.thymeleafproject.examples;

import java.util.Optional;

public class Exceptions {

    public void throwUncheckedException(){
        throw new RuntimeException("unchecked exception");
    }


    //businses logic exception
    public void throwCheckedException() throws Exception {
        throw new Exception("unchecked exception");
    }

    public void throwCheckedException2()  {
        new IllegalArgumentException();
        new UnsupportedOperationException();

        new NullPointerException();



    }

    private void runMethodWtihException() {
        try {
            throw new Exception("unchecked exception");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void handleException(){
        throwUncheckedException();

        throwCheckedException2();

        try {
            throwCheckedException();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

interface WithImplementation{

    default void doSthWithString(String s){
        System.out.println(s);
    };
}



class OptionalExample{

    public void doSthWithDziadek(){

        Optional<Dziadek> asd = buildNew("asd");
        Optional<String> string = asd.map(dziadek -> dziadek.getMadrosc());


    }

    Optional<Dziadek> buildNew(String name){
        if (name.contains("franek")) {
            return null;
        }
        return Optional.of(new Dziadek(name));
    }
}
