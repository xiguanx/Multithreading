package threadSynchronisation;

public class Synchronisation {
    private static int count = 0;
    public static void main(String[] args) {
        Thread one = new Thread(() -> {
            for(int i = 0; i < 10000; i++) {
                increment();
            }
        });
        Thread two = new Thread(() -> {
            for(int i = 0; i < 10000; i++) {
                increment();
            }
        });

        one.start();
        two.start();

        try{
            one.join();
            two.join();
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }

        System.out.println(count);
    }

    private synchronized static void increment() {
        count++;
    }
}
