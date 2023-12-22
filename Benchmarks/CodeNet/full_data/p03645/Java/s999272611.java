
import java.io.*;
import java.util.*;
//import java.util.Map.Entry;
//import java.util.stream.*;
//import java.math.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        long MOD = (long) (Math.pow(10, 9) + 7);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ai[] = new int[m];
        int bi[] = new int[m];
        int find = -1;
        ai[0] = sc.nextInt();
        bi[0] = sc.nextInt();
        if (bi[0] != n) {
            find = bi[0];
        }
        boolean flag = false;
        for (int i = 1; i < m; i++) {
            int p1 = sc.nextInt();
            int p2 = sc.nextInt();
            ai[i] = p1;
            bi[i] = p2;
            if (find != -1 && bi[i] == n) {
                flag = true;
            }
        }
        System.out.print((flag == true) ? "" : "IM");
        System.out.println("POSSIBLE");
        bw.flush();
    }
//==============================================//
//==============================================//
//==============================================//
//==============================================//
//==============================================//
//==============================================//
//==============================================//
//==============================================//

    static class Pair implements Comparable<Pair> {

        int a, b;

        public Pair(int x, int y) {
            a = x;
            b = y;
        }

        @Override
        public int compareTo(Pair p) {
            return a - p.a;
        }
    }

    static void forl_0(int n, int[] array, Scanner sc) {
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
    }

    static void forl_1(int n, int[] array, Scanner sc) {
        for (int i = 1; i <= n; i++) {
            array[i] = sc.nextInt();
        }
    }

    static void two_d(int n, int m, int[][] array, Scanner sc) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = sc.nextInt();
            }
        }
    }

    static boolean isPrime(long n) {
        if (n < 2) {
            return false;
        } else if (n == 2 || n == 3) {
            return true;
        } else if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        long sqrtN = (long) Math.sqrt(n) + 1;
        for (long i = 6L; i <= sqrtN; i += 6) {
            if (n % (i - 1) == 0 || n % (i + 1) == 0) {
                return false;
            }
        }
        return true;
    }

    public static long gcd(long a, long b) {
        return (b == 0) ? a : gcd(b, a % b);
    }

    public static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }
}
