package personal.threads;

public class ThreadsExercises004 {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public static void main(String[] args) {
        ThreadsExercises004 syncExample = new ThreadsExercises004();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                syncExample.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                syncExample.increment();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Count: " + syncExample.count);
    }
}