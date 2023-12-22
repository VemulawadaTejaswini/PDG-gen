import java.util.*;

public class Main {
    public void main(Scanner sc) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();

            if (a < b) {
                System.out.println("No");
            } else if (c + d < b) {
                System.out.println("No");
            } else if (d < b) {
                System.out.println("No");
            } else if (b == d) {
                long p = a - b;
                if (p <= c) {
                    System.out.println("Yes");
                } else {
                    if (p < b) {
                        System.out.println("No");
                    } else {
                        System.out.println((p % b > c) ? "No" : "Yes");
                    }
                }
            } else {
                long p = a - b;
                long del = d - b;
                if (c < p) {
                    p %= b;
                }

                long x = ((c >= p) ? ((c - p) / del) : -1);
                long min = p + del * (x + 1);
                System.out.println(min >= b ? "Yes" : "No");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
