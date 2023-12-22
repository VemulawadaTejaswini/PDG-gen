import java.util.Scanner;

public class Main {
    int n;
    long[] as;
    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    private void read() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        as = new long[n];
        for (int i = 0; i < n; i++)
            as[i] = sc.nextLong();
    }

    private void solve() {
        boolean flg = true;
        for (int i = 0; i < n - 1; i++) {
            flg &= (as[i] == as[i+1]);
        }
        if (flg) {
            String ret = doAccum();
            System.out.println(n - 1);
            System.out.println(ret);
        }
        else {
            long max = as[0], min = as[0];
            int maxIx = 0, minIx = 0;
            for (int i = 0; i < n; i++) {
                if (max < as[i]) {
                    max = as[i];
                    maxIx = i + 1;
                }
                if (min > as[i]) {
                    min = as[i];
                    minIx = i + 1;
                }
            }
            String s;
            if (Math.abs(max) < Math.abs(min)) {
                s = doFlatten(minIx);
            }
            else
                s = doFlatten(maxIx);
            System.out.println(2 * n - 2);
            System.out.println(s);
            System.out.println(doAccum());
        }
    }

    private String doAccum() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(i);
            sb.append(" ");
            sb.append(i+1);
            sb.append("\n");
        }
        return sb.toString().trim();
    }

    private String doFlatten(int ix) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i == ix - 1) continue;
            sb.append(ix);
            sb.append(" ");
            sb.append((i+1));
            sb.append("\n");
        }
        return sb.toString().trim();
    }
}
