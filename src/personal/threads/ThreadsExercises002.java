package personal.threads;

    public class ThreadsExercises002 extends Thread {
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread " + Thread.currentThread().getId() + ": " + i);
            }
        }

        public static void main(String[] args) {
            ThreadsExercises002 thread1 = new ThreadsExercises002();
            ThreadsExercises002 thread2 = new ThreadsExercises002();

            thread1.start();
            thread2.start();
        }
    }
