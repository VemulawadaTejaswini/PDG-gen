import java.util.*;

class Main {
    int N;
    long K;
    long[] A;

    Main() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextLong();
        A = new long[N];
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextLong();
        }
        sc.close();
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.zeroCheck();
        System.out.println(obj.sum());
    }

    public void zeroCheck() {
        if (K == 0) {
            System.out.println(A[0]);
            System.exit(0);
        }
    }

    public long calcMax() {
        long max = 0;
        max = ~A[0];

        for (int i = 1; i < A.length; i++) {
            // System.out.println(max & ~A[i]);
            max = max & ~A[i];
        }
        return -max;
    }

    // public long calc() {
    // HashMap<Long, Long> digit = new HashMap<>();

    // }

    public long sum() {
        long s = 0;
        long i, Max;
        Max = calcMax();
        // if (K < Max) {
        while (K < Max) {
            Max >>>= 1;
        }
        // } else {
        i = Max;
        // }
        for (int j = 0; j < N; j++) {
            // System.out.println(i + " XOR " + A[j] + " = " + (i ^ A[j]));
            s += i ^ A[j];
        }
        return s;
    }
}