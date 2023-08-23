package personal.threads;

public class ThreadsExercises003 implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + Thread.currentThread().getId() + ": " + i);
        }
    }

    public static void main(String[] args) {
        ThreadsExercises003 runnable = new ThreadsExercises003();

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();
    }
}