import java.util.concurrent.BlockingQueue;

public class Printer extends Thread{
    private SharedQueue sharedQueue;

    public Printer(SharedQueue sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        try {
            while (sharedQueue.isEmpty()) {
                PrintJob job = sharedQueue.retrievePrintJob();
                // Process the print job
                System.out.println("Printing: " + job.getFileName());
                //Thread.sleep(3000); // Simulating printing time
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
