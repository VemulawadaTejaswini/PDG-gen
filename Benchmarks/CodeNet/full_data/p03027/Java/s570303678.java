import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Q = sc.nextInt();

        long[] results = new long[Q];

        for (int i=0; i<Q; i++) {
            long x = sc.nextLong();
            long d = sc.nextLong();
            long n = sc.nextLong();

            long result = 1;
            for (int j=0; j<n; j++) {
                result = result * (x + j*d) % 1000003;
            }
            results[i] = result;
        }

        for (long result : results) {
            System.out.println(result);
        }
    }
}

