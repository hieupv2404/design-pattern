package main.java.com.hieupv.dp.factory;

public class BankFactory {
    public static final Bank setBank(BankType bankType) throws Exception {
        switch (bankType){
            case VP:
               return new VP();
            case TECH:
                return new Tech();
            default:
                throw new Exception("BankType unavailable");
        }
    }

    private BankFactory(){

    }
}
