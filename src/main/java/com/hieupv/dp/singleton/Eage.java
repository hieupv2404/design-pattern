package main.java.com.hieupv.dp.singleton;

public class Eage {
    private final static Eage instance = new Eage();

    private Eage(){

    }

    public static Eage getInstance(){
        return instance;
    }
}
