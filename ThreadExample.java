import java.util.Scanner;

public class ThreadExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        for (int i = 1; i <= k; i++) {
            Thread thread = new Thread(new Work(i, n));
            thread.start();
        }
        sc.close();
    }
}