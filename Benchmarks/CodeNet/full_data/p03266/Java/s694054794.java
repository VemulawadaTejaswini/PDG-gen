import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long[] num = new long[K];
        for (int i = 1; i <= N; i++) {
            num[i % K]++;
        }
        long sum = 0;
        for (int ar = 0; ar < K; ar++) {
            int br = (K - ar) % K;
            int cr = (K - ar) % K;
            if ((br + cr) % K != 0) {
                continue;
            }
            sum += num[ar] * num[br] * num[cr];
        }
        System.out.println(sum);
        sc.close();
    }
}