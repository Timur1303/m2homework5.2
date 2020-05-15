import java.util.concurrent.Semaphore;

public class Passenger extends Thread {
    private Semaphore semaphore;

    public Passenger(Semaphore semaphore) {
        this.semaphore = semaphore;
    }
    

    @Override
    public void run() {
        try {
            semaphore.acquire();
            System.out.println(this.getName()+ " купил билет");
            sleep(1000);
            System.out.println(this.getName()+ " сел в автобус");
            semaphore.release();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
