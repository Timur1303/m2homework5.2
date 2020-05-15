import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(4);
        for (int i = 1; i <= 100; i++) {
            Passenger p = new Passenger(semaphore);
            p.setName("Пассажир " + i );
            p.start();
        }
    }
}
