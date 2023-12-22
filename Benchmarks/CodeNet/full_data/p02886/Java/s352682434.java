import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] d = new int[N];
        for (int i = 0; i < N; i++) {
            d[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(PrimeSum(N, d));
    }
    public static long PrimeSum(int N, int[] d) {
        if (N < 2) {
            return 0;
        }
        long sum = 0;
        for (int i = 0; i < N-1; i++) {
            sum += (d[N-1] * d[i]);
        }
        return sum + PrimeSum(N-1, d);
    }
}
