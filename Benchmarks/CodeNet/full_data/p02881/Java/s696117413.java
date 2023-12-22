import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = Long.parseLong(sc.next());
        long count = N;
        for (long i = 0; i <= N; i++) {
            for (long j = i; j <= N; j++) {
                if (i + j > N) break;
                long value = (i + 1) * (j + 1);
                if (value == N) {
                    count = Math.min(count, i + j);
                } else if (value > N) {
                    break;
                }
            }
        }

        System.out.println(count);
    }
}