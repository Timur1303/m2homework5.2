import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {
        int passengers = 100;
        Semaphore semaphore = new Semaphore(4);
        CountDownLatch countDownLatch = new CountDownLatch(passengers);
        for (int i = 1; i <= passengers; i++) {
            Passenger p = new Passenger(semaphore, countDownLatch);
            p.setName("Пассажир " + i);
            p.start();
        }
    }
}
