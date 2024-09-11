import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class SharedQueue {
    private BlockingQueue<PrintJob> queue;

    public SharedQueue(int capacity) {
        queue = new ArrayBlockingQueue<>(capacity);
    }
    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public void addPrintJob(PrintJob job) throws InterruptedException {
        queue.put(job);
    }

    public PrintJob retrievePrintJob() throws InterruptedException {
        return queue.take();
    }
}


