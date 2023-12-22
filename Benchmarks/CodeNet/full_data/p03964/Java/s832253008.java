import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        int N;
        long[] Ti;
        long[] Ai;

        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            Ti = new long[N];
            Ai = new long[N];
            for (int i = 0; i < N; i++) {
                Ti[i] = sc.nextLong();
                Ai[i] = sc.nextLong();
            }
        }
        int[] Si = new int[N];

        for (int i = 1; i < N; i++) {
            long t = (Ti[i - 1] + Ti[i] - 1) / Ti[i];
            long a = (Ai[i - 1] + Ai[i] - 1) / Ai[i];
            long d = Math.max(t, a);
            //debug("d" + d);
            Ti[i] = (long) (Ti[i] * d);
            Ai[i] = (long) (Ai[i] * d);
        }
        long temp = Ti[N - 1] + Ai[N - 1];

        System.out.println(temp);
    }

}
