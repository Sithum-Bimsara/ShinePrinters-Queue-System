public class Main {
    public static void main(String[] args) throws InterruptedException {
        SharedQueue sharedQueue = new SharedQueue(5);


        Thread computer1 = new Computer(sharedQueue);
        Thread computer2 = new Computer(sharedQueue);
        Computer computer3 = new Computer(sharedQueue);
        Thread printer1 = new Printer(sharedQueue);
        Thread printer2 = new Printer(sharedQueue);
        computer3.setPrintJob("efef", "txt");
        //
        // computer3.join();

        //computer1.start();
        //computer2.start();
        computer3.start();
        printer1.start();
        printer2.start();


        // Example usage :

    }
}