package basicMultithreading;

public class ThreadPriority {
    public static void main(String[] args) {
        /* output:
        * 5
        * 10

        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        System.out.println(Thread.currentThread().getPriority());
         */

        /* FIFO with the same priority
        *
        * */
        System.out.println(Thread.currentThread().getName() + " is running");
        Thread one = new Thread(() -> {
            System.out.println("Thread one is running");
        });
        one.setPriority(Thread.MAX_PRIORITY);
        one.start();
    }
}
