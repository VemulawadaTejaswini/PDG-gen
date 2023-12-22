import java.util.Scanner;
public class Main {
    static final long INF = (long)Math.pow(10, 12);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long min = INF;
        for (long i = 1; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                min = Math.min(min, i + N / i - 2);
            }
        }
        System.out.println(min);
        sc.close();
    }
}