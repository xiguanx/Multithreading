package basicMultithreading;

public class JoinThread {
    public static void main(String[] args) {
        Thread one = new Thread(() -> {
            for(int i = 0; i < 5; i++) {
                System.out.println("Thread 1: " + i);
            }
        });

        Thread two = new Thread(() -> {
            for(int i = 0; i < 25; i++) {
                System.out.println("Thread 2: " + i);
            }
        });

        one.start();
        two.start();
        System.out.println("Main thread joined");
    }
}
