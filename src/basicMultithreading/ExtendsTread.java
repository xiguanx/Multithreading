package basicMultithreading;

public class ExtendsTread {
    public static void main(String[] args) {
        Thread one = new Thread1();
        Thread two = new Thread2();

        one.start();
        two.start();
    }
}

class Thread1 extends Thread {
    @Override
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Thread1: " + i);
        }
    }
}

class Thread2 extends Thread {
    @Override
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Thread2: " + i);
        }
    }
}
