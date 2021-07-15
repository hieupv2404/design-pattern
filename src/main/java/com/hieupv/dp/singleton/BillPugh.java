package main.java.com.hieupv.dp.singleton;

public class BillPugh {
    private static class SingletonHelper{
        private final static BillPugh INSTANCE = new BillPugh();
    }

    private BillPugh(){

    }

    public static BillPugh getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
