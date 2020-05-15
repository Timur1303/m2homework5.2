import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(4);
        CountDownLatch countDownLatch = new CountDownLatch(100);
        for (int i = 1; i <=100; i++) {
            Passenger p = new Passenger(semaphore, countDownLatch);
            p.setName("Пассажир " + i);
            p.start();
        }
    }
}
