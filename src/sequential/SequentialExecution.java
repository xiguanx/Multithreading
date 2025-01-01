package sequential;

public class SequentialExecution {
    public static void main(String[] args) {
        demo1();
        demo2();
    }

    private static void demo1() {
        for(int i = 0; i < 5; i++){
            System.out.println("demo1: " + i);
        }
    }

    private static void demo2() {
        for(int i = 0; i < 5; i++){
            System.out.println("demo2: " + i);
        }
    }
}