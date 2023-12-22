import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        Work[] ab = new Work[n];
        for (int i = 0; i < n; i++) {
            ab[i] = new Work(sc.nextLong(), sc.nextLong());
        }
        Arrays.sort(ab, (ab1, ab2) -> {
            return Long.compare(ab1.b, ab2.b);
        });
        long sum = 0;
        for (Work w : ab) {
            sum += w.a;
            if (sum > w.b) {
                System.out.println("No");
                System.exit(0);
            }
        }
        System.out.println("Yes");
    }

    static class Work {
        long a;
        long b;

        public Work(long a, long b) {
            this.a = a;
            this.b = b;
        }
    }

}
