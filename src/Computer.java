import java.util.concurrent.BlockingQueue;

public class Computer extends Thread {
    private SharedQueue sharedQueue;
    private boolean availability;
    private PrintJob printJob;

    public Computer(SharedQueue sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        //while (true) {
             try{
                 //PrintJob printJob = new PrintJob("abcd","txt");
                if (!isSupportedFileType(printJob.getFileType())) {
                    throw new TypeNotSupportedException("File type not supported: " + printJob.getFileType());
                }
                sharedQueue.addPrintJob(printJob);

                Thread.sleep(2000); // Simulating printing time
             } catch (InterruptedException | TypeNotSupportedException e) {
                 System.err.println(e.getMessage());}
        //}
    }

    private boolean isSupportedFileType(String fileType) {
        // Logic to check if the file type is supported
        return fileType.equals("txt") || fileType.equals("pdf");
    }
    private boolean isAvailable(){
        return availability;
    }


    public void setPrintJob(String filename , String fileType) {
        PrintJob printJob1 = new PrintJob(filename , fileType);
        this.printJob=printJob1;
    }
}