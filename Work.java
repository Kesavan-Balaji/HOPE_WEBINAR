public class Work implements Runnable {
    private int id;
    private int n;

    public Work(int id, int n) {
        this.id = id;
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 1; i <= n; i++) {
            System.out.println("Worker " + id + " Task: " + i);
        }
    }
}