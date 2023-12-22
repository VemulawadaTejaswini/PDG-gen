import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            int cnt = 0;

            for (int from = 0; from < n; from++) {
                breakTo: for (int to = from; to < n; to++) {
                    long sum = 0;
                    for (int idx = from; idx <= to; idx++) {
                        sum += a[idx];
                        if (sum >= k) {
                            cnt += (n - idx);
                            break breakTo;
                        }
                    }
                }
            }
            System.out.println(cnt);
        }
    }

}
