package main.java.com.hieupv.dp.singleton;

public class ApplicationSingleton {
    public static void main(String[] args) {
        /*
        BILLPUGH
         */
//        BillPugh billPugh1 = BillPugh.getInstance();
//        BillPugh billPugh2 = BillPugh.getInstance();
//        System.out.println(billPugh1.hashCode());
//        System.out.println(billPugh2.hashCode());

        /*
        EAGE
         */
//        Eage eage1 = Eage.getInstance();
//        Eage eage2 = Eage.getInstance();
//        System.out.println(eage1==eage2);

        /*
        DOUBLE CHECK
         */
        final DoubleCheck[] doubleCheckThread1 = new DoubleCheck[2];
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                doubleCheckThread1[0] = DoubleCheck.getInstance();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                doubleCheckThread1[1] = DoubleCheck.getInstance();
            }
        });
        thread1.start();
        thread2.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(doubleCheckThread1[0].hashCode());
        System.out.println(doubleCheckThread1[1].hashCode());
    }
}
