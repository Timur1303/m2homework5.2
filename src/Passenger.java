import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class Passenger extends Thread {
    private Semaphore semaphore;
    private CountDownLatch cdl;

    public Passenger(Semaphore semaphore, CountDownLatch cdl) {
        this.semaphore = semaphore;
        this.cdl = cdl;
    }



    @Override
    public synchronized void run() {
        try {
            semaphore.acquire();
            System.out.println(this.getName()+ " купил билет ");
            sleep(1000);
            System.out.println(this.getName()+ " сел в автобус");
            sleep(2000);
            semaphore.release();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
