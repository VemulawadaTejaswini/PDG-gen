import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
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
            Arith arith = new Arith();
            final int MOD = (int) 1e9 + 7;
            int n = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            // すべての花束の作り方は2^n
            // ここからなくすのは0本を使う場合の1通り
            // a本を選ぶ場合のnCa
            // b本を選ぶ場合のnCb
            // これらはすべて排反であるからどれも独立に求めていい
            ModInt ans = new ModInt(arith.modPow(2, n, MOD) - 1);
            ModInt facA = new ModInt(arith.modPerm(a, a, MOD));
            facA.inv();
            ModInt nCa = new ModInt(arith.modPerm(n, a, MOD));
            nCa.mul(facA.getVal());
            ModInt facB = new ModInt(arith.modPerm(b, b, MOD));
            facB.inv();
            ModInt nCb = new ModInt(arith.modPerm(n, b, MOD));
            nCb.mul(facB.getVal());
            ans.sub(nCa.getVal() + nCb.getVal());
            out.println(ans.getVal());
        }

    }

    static class Arith {
        public int modPerm(int n, int k, int MOD) {
            long res = 1;
            for (int i = 0; i < k; i++) {
                res *= (n - i);
                res %= MOD;
            }
            return (int) res;
        }

        public int modPow(int a, int x, int MOD) {
            long res = 1;
            long mul = a;
            while (x != 0) {
                if (x % 2 != 0) {
                    res *= mul;
                    res %= MOD;
                }
                mul *= mul;
                mul %= MOD;
                x /= 2;
            }
            return (int) res;
        }

    }

    static class ModInt {
        int val;
        int MOD = (int) 1e9 + 7;

        public ModInt(long i) {
            this.val = (int) (i % MOD);
        }

        public void sub(long i) {
            this.val = (int) ((this.val - (i % MOD) + MOD) % MOD);
        }

        public void mul(long i) {
            long res = this.val;
            this.val = (int) ((res * i) % MOD);
        }

        public void inv() {
            pow(MOD - 2);
        }

        public void pow(int p) {
            long res = 1;
            long mul = this.val;
            while (p != 0) {
                if (p % 2 != 0) {
                    res *= mul;
                    res %= MOD;
                }
                p /= 2;
                mul *= mul;
                mul %= MOD;
            }
            this.val = (int) res;
        }

        public int getVal() {
            return val;
        }

    }
}

