# ShinePrinters : Multi-threaded Print Job System

## Project Overview
This project is a multi-threaded solution for **ShinePrinters**, a printing shop that allows customers to create and manage print jobs using multiple computers and printers over a shared network. The solution utilizes the **Producer-Consumer** model to manage the print job queue, ensuring a robust and synchronized system for handling concurrent job requests and processing them efficiently.

The project consists of the following key components:
- **PrintJob**: Represents the print job details.
- **Computer**: Simulates a computer creating print jobs and adding them to the shared queue.
- **Printer**: Represents a printer that retrieves print jobs from the shared queue and processes them.
- **SharedQueue**: A shared buffer queue with a maximum capacity of 5 jobs, where computers (producers) add jobs and printers (consumers) retrieve them.
- **Main**: The entry point of the application where the system is initialized and executed.
  
## Features
- **Multi-threaded Producer-Consumer Solution**: Ensures safe, synchronized access to the shared queue using Java’s concurrency tools.
- **Error Handling**: Handles memory consistency errors and race conditions to ensure reliable operation in a multi-threaded environment.
- **TypeNotSupportedException**: Printers handle only certain file types. If an unsupported file type is encountered, a custom exception (`TypeNotSupportedException`) is thrown and handled.
  
## Memory Consistency and Error Handling
- Proper synchronization is enforced using `synchronized` blocks to manage access to the shared queue and avoid race conditions.
- Edge cases such as the queue being full (for producers) or empty (for consumers) are handled appropriately using `wait()` and `notify()` methods.
- Custom exceptions, including `TypeNotSupportedException`, are defined and handled gracefully in the code.

## Classes
- **PrintJob**: Represents a print job object with attributes like job ID, file type, and content.
- **Computer**: Simulates the producer, which creates a `PrintJob` and adds it to the `SharedQueue`.
- **Printer**: Simulates the consumer, retrieving jobs from the `SharedQueue` and processing them.
- **SharedQueue**: Manages the job queue with a capacity of 5 jobs, ensuring synchronization across multiple threads.
- **Main**: Orchestrates the system, initializing computers, printers, and the shared queue.
  
## Running the Project
1. Clone the repository:
    ```bash
    git clone https://github.com/SithumBimsara20030113/ShinePrinters-Queue-System.git 
    ```
2. Compile and run the `Main` class to start the simulation:
    ```bash
    javac Main.java
    java Main
    ```

## Example Output
Upon running the project, you'll see a series of log messages indicating the creation of print jobs by computers and their processing by printers.

## Handling Unsupported File Types
If a print job is submitted with an unsupported file type, the system will throw a `TypeNotSupportedException`, which will be logged and handled appropriately.

## Conclusion
This project is a basic implementation of a producer-consumer pattern to simulate a networked printing system. It ensures synchronization, handles exceptions, and provides a foundation for adding more advanced features in the future.


