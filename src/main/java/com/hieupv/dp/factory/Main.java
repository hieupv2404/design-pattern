package main.java.com.hieupv.dp.factory;

public class Main {
    public static void main(String[] args) throws Exception {
        Bank bank = BankFactory.setBank(BankType.TECH);
        System.out.println(bank.getName());
    }
}
