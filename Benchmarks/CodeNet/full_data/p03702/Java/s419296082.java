
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static long MOD = 109+7;

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long a = sc.nextLong();
        long b = sc.nextLong();

        long[] h = new long[N];
        for(int i = 0; i < N; i++) h[i] = sc.nextInt();
        Arrays.sort(h);
        int count = 0;
        while(h[N - 1] > 0) {
            for(int i = 0 ; i < N - 1; i++) {
                h[i] -= b;
            }
            h[N - 1] -= a;
            Arrays.sort(h);
            count++;
        }

        System.out.println(count);
    }
}