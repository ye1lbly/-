package practice;

/* 13-1 */
public class Practice13 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Thread1());
        thread.start();
    }
}

class Thread1 implements Runnable {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print('-');
        }
    }
}