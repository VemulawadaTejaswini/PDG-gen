import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        long numOfT = 1;
        long numOfA = 1;
        for (int i = 0; i < n; i++) {
            long t = sc.nextLong();
            long a = sc.nextLong();

            long x = (long)Math.max(Math.ceil((double)numOfT / t), Math.ceil((double)numOfA / a));
            numOfT = t * x;
            numOfA = a * x;
        }
        System.out.println(numOfT + numOfA);
    }
}
