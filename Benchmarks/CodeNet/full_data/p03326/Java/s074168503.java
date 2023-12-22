import java.util.*;

public class Main {
    private class Cake {
        long x, y, z;

        public Cake(long x, long y, long z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }

    public void main(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        Cake cake[] = new Cake[n];
        for (int i = 0; i < n; i++) {
            cake[i] = new Cake(sc.nextLong(), sc.nextLong(), sc.nextLong());
        }

        long ans = 0;
        long sums[] = new long[n];
        for (int i = 0; i < 8; i++) {
            int a = (i % 2) * 2 - 1;
            int b = ((i >> 1) % 2) * 2 - 1;
            int c = ((i >> 2) % 2) * 2 - 1;
            for (int j = 0; j < n; j++) {
                sums[j] = cake[j].x * a + cake[j].y * b + cake[j].z * c;
            }

            Arrays.sort(sums);
            long sum = 0;
            for (int j = 0; j < m; j++) {
                sum += sums[n - j - 1];
            }
            ans = Math.max(ans, sum);
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
