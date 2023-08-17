package personal.threads;

public class ThreadsExercises002 extends Thread {

        public static int amount = 0;

        public static void main(String[] args) {
            ThreadsExercises002 thread = new ThreadsExercises002();
            thread.start();
            System.out.println(amount);
            amount++;
            System.out.println(amount);
        }

    public void run() {
        amount++;
    }
}