import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author varunvats32
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DBouquet solver = new DBouquet();
        solver.solve(1, in, out);
        out.close();
    }

    static class DBouquet {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();

            DBouquet.ModInt ac = comb(n, a);
            DBouquet.ModInt bc = comb(n, b);
            DBouquet.ModInt ec = (new DBouquet.ModInt(2)).pow(n);

            DBouquet.ModInt ans = DBouquet.ModInt.subtract(ec, DBouquet.ModInt.add(ac, bc));
            out.println(DBouquet.ModInt.subtract(ans, new DBouquet.ModInt(1)).x);
        }

        private DBouquet.ModInt comb(int n, int a) {
            DBouquet.ModInt ans = new DBouquet.ModInt(1);
            for (int i = n - a + 1, j = a; i <= n; i++, j--) {
                ans.multiply(new DBouquet.ModInt(i));
                ans.divide(new DBouquet.ModInt(j));
            }
            return ans;
        }

        public static class ModInt {
            private static final int mod = 1000000007;
            public long x;

            public ModInt(long x) {
                this.x = (x % mod + mod) % mod;
            }

            public static DBouquet.ModInt add(DBouquet.ModInt a, DBouquet.ModInt b) {
                DBouquet.ModInt c = new DBouquet.ModInt(a.x);
                if ((c.x += b.x) >= mod) c.x -= mod;
                return c;
            }

            public static DBouquet.ModInt subtract(DBouquet.ModInt a, DBouquet.ModInt b) {
                DBouquet.ModInt c = new DBouquet.ModInt(a.x);
                if ((c.x += mod - b.x) >= mod) c.x -= mod;
                return c;
            }

            public DBouquet.ModInt multiply(DBouquet.ModInt a) {
                x *= a.x;
                x %= mod;
                return new DBouquet.ModInt(x);
            }

            public DBouquet.ModInt inv() {
                return pow(mod - 2);
            }

            public DBouquet.ModInt divide(DBouquet.ModInt a) {
                return this.multiply(a.inv());
            }

            public DBouquet.ModInt pow(long p) {
                if (p == 0) return new DBouquet.ModInt(1);
                DBouquet.ModInt r = pow(p >> 1);
                r = r.multiply(r);
                if ((p & 1) == 1)
                    r = r.multiply(this);
                return r;
            }

        }

    }
}

