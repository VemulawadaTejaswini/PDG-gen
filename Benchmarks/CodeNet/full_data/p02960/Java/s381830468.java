import java.util.*;
import java.io.*;

public class Main {
    public static int[][] dp;
    static int[] multiplier = new int[13];
    public static void main(String[] args) {
        String s = sc.nextStr();
        int N = s.length();
        dp = new int[N+1][13];
        for (int i = 0; i<13; i++) {
            multiplier[i] = (10*i)%13;
            // writer.print(multiplier[i]);
            // writer.print(", ");
        }
        // writer.println();
        dp[0][0] = 1;
        // writer.println(s);
        for (int i = 0; i < N; i++) {
            if (i>0) multiply(i);
            char c = s.charAt(i);
            if (c != '?') {
                int digit = c - '0';
                // writer.println(digit);
                for (int r = 0; r < 13; r++) {
                    int nextR = mod13Add(r, digit);
                    dp[i+1][nextR] = dp[i][r];
                }
            } else {
                // writer.print("?, i = ");
                // writer.println(i);

                int[] diff = new int[13];
                for (int r = 0; r < 13; r++) {
                    int end = mod13Add(r, r+10);
                    diff[r] += dp[i][r];
                    diff[r] = properMod(diff[r]);
                    diff[end] -= dp[i][r];
                    diff[end] = properMod(diff[end]);
                    if (r + 10> 13) {
                        diff[0] += dp[i][r];
                        diff[0] = properMod(diff[0]);
                    }
                }
                for (int r = 0; r < 13; r++) {
                    // writer.print(diff[r]);
                    // writer.print(", ");
                }
                // writer.println();
                int sum = 0;
                for (int r = 0; r < 13; r++) {
                    sum += diff[r];
                    sum = properMod(sum);
                    dp[i+1][r] = sum;
                }
            }
        }
        // for (int i = 0; i < N+1; i++) {
        //     for (int j= 0; j < 13; j++) {
        //         writer.print(dp[i][j]);
        //         writer.print(", ");
        //     }
        //     writer.println();
        // }
        int ans = dp[N][5];
        writer.println(ans);
        writer.flush();
        
    }

    static void multiply(int i){
        int[] tmp = new int[13];
        for (int r = 0; r < 13; r++) {
            tmp[r] = dp[i][r];
        }
        for (int r = 0; r < 13; r++) {
            int index = multiplier[r];
            dp[i][index] = tmp[r];
        }
    }

    static int mod13Add(int x, int y) {
        return (x+y)%13;
    }

    static final FastScanner sc = new FastScanner(System.in);
    static PrintWriter writer = new PrintWriter(System.out);

    static class FastScanner {
        Reader input;
 
        FastScanner() {
            this(System.in);
        }
 
        FastScanner(InputStream stream) {
            this.input = new BufferedReader(new InputStreamReader(stream));
        }
 
        int nextInt() {
            return (int) nextLong();
        }
 
        long nextLong() {
            try {
                int sign = 1;
                int b = input.read();
                while ((b < '0' || '9' < b) && b != '-' && b != '+') {
                    b = input.read();
                }
                if (b == '-') {
                    sign = -1;
                    b = input.read();
                } else if (b == '+') {
                    b = input.read();
                }
                long ret = b - '0';
                while (true) {
                    b = input.read();
                    if (b < '0' || '9' < b) return ret * sign;
                    ret *= 10;
                    ret += b - '0';
                }
            } catch (IOException e) {
                e.printStackTrace();
                return -1;
            }
        }
 
        double nextDouble() {
            try {
                double sign = 1;
                int b = input.read();
                while ((b < '0' || '9' < b) && b != '-' && b != '+') {
                    b = input.read();
                }
                if (b == '-') {
                    sign = -1;
                    b = input.read();
                } else if (b == '+') {
                    b = input.read();
                }
                double ret = b - '0';
                while (true) {
                    b = input.read();
                    if (b < '0' || '9' < b) break;
                    ret *= 10;
                    ret += b - '0';
                }
                if (b != '.') return sign * ret;
                double div = 1;
                b = input.read();
                while ('0' <= b && b <= '9') {
                    ret *= 10;
                    ret += b - '0';
                    div *= 10;
                    b = input.read();
                }
                return sign * ret / div;
            } catch (IOException e) {
                e.printStackTrace();
                return Double.NaN;
            }
        }
 
        char nextChar() {
            try {
                int b = input.read();
                while (Character.isWhitespace(b)) {
                    b = input.read();
                }
                return (char) b;
            } catch (IOException e) {
                e.printStackTrace();
                return 0;
            }
        }
 
        String nextStr() {
            try {
                StringBuilder sb = new StringBuilder();
                int b = input.read();
                while (Character.isWhitespace(b)) {
                    b = input.read();
                }
                while (b != -1 && !Character.isWhitespace(b)) {
                    sb.append((char) b);
                    b = input.read();
                }
                return sb.toString();
            } catch (IOException e) {
                e.printStackTrace();
                return "";
            }
        }
    }
    //FAST SCANNER END HERE

    //MOD INT SNIPPET FROM HERE
    public static final int MOD = 1_000_000_007;
    public static int[] fact;
    public static int[] invfact;
    
    /**
    * @param n Calculate factorials/inverse factorials for x = [0,n]
    */
    public static void preCalcFactorials(int n) {
        fact = new int[n + 1];
        invfact = new int[n + 1];
        fact[0] = 1;
        invfact[0] = 1;
        for (int i = 1; i < n + 1; i++) {
            fact[i] = modProd(i, fact[i-1]);
            int inv = invMod(i);
            invfact[i] = modProd(inv, invfact[i-1]);
        }
    }
    
    public static int properMod(int x) {
        int ans = x%MOD;
        if (ans < 0) ans += MOD;
        return ans;
    }
    
    /**
    * preCalcFactorials() should be executed beforehand.
    * Calculate nCm modulo to global MOD.
    * @param n
    * @param m
    * @return
    */
    public static int combMod(int n, int m) {
        int ans = modProd(fact[n], invfact[n-m]);
        ans = modProd(ans, invfact[m]);
        return ans;
    }
    /**
    * Calculate a product of 2 integers modulo to mod
    * @param x
    * @param y
    * @param mod modulo
    * @return
    */
    public static int modProd(int x, int y) {
        long ans = ((long) x) * ((long) y); //prevent overflow
        ans %= MOD;
        if (ans < 0) ans += MOD;
        return (int) ans;
    }
    /**
    * Calculate a power of integer modulo to mod
    * @param x
    * @param pow
    * @param mod
    * @return
    */
    public static int modPow(int x, int pow) {
        if (pow == 0) return 1;
        int y = modProd(x,x);
        int ans; 
        if (pow % 2 == 1) {
            ans = x;
        } else {
            ans = 1;
        }
        ans = modProd(ans, modPow(y, pow/2));
        return ans;
    }
    /**
    * Calculate a inverse of an integer modulo to mod, using Fermat's Theorem.
    * Assuming mod is a prime number.
    * @param x
    * @param mod
    * @return
    */
    public static int invMod(int x) {
        return modPow(x, MOD - 2);
    }
    
    /**
    * x / y modulo MOD global
    * @param x
    * @param y
    * @return
    */
    public static int modDivide(int x, int y) {
        return modProd(x, invMod(y));
    }
    //MOD INT SNIPPET END HERE
}
