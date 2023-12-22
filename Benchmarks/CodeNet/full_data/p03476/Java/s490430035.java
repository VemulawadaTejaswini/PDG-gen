import java.util.*;

public class Main {
        static int RMAX = 100001;
        static boolean[] primes = new boolean[RMAX];
        static int[] count2017num = new int[RMAX];
        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                StringBuilder sb = new StringBuilder(1000000);
                int Q = sc.nextInt();
                e();
                for (int i = 0; i < Q; i++) {
                        int l = sc.nextInt();
                        int r = sc.nextInt();
                        sb.append(count2017num[r] - count2017num[l - 1]);
                        sb.append('\n');
                }
                System.out.print(sb);
        }

        static void e() {
                for (int i = 2; i < RMAX; i++) {
                        primes[i] = true;
                }
                for (int i = 2; i < RMAX; i++) {
                        if (!primes[i]) {
                                continue;
                        }
                        for (int j = 2; j * i < RMAX; j++) {
                                primes[i * j] = false;
                        }
                }
                int counter = 0;
                for (int i = 1; i < RMAX; i++) {
                        if (primes[i] && primes[(i + 1) / 2]) counter++;
                        count2017num[i] = counter;
                }
        }
}
