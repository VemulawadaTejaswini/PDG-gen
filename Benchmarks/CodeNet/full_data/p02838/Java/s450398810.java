import java.util.*;

class Main {
    public static void main(String[] args) {
        final long MOD = 1_000_000_007L;
        final Scanner sc = new Scanner(System.in);
        final int N = Integer.parseInt(sc.next());
        final long A[] = new long[N];
        for (int i=0; i<N; i++) {
            A[i] =  Long.parseLong(sc.next());
        }
        sc.close();

        long sum = 0L;
        for (int i=0; i<N; i++) {
            for (int j=i+1; j<N; j++) {
                sum += A[i]^A[j];
                sum = sum % MOD;
            }
        }
        System.out.println(sum);
    }
}