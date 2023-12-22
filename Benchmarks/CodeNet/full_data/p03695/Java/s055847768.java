
import java.io.*;
import java.util.*;
//import java.util.Map.Entry;
//import java.util.stream.*;
//import java.math.*;

public class Main {

    public static int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[8];
        int count = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num < 400) {
                array[0] = 1;
            } else if (num < 800) {
                array[1] = 1;
            } else if (num < 1200) {
                array[2] = 1;
            } else if (num < 1600) {
                array[3] = 1;
            } else if (num < 2000) {
                array[4] = 1;
            } else if (num < 2400) {
                array[5] = 1;
            } else if (num < 2800) {
                array[6] = 1;
            } else if (num < 3200) {
                array[7] = 1;
            } else {
                count++;
            }
        }
        int min = 0;
        int max = 0;
        for (int i = 0; i < 8; i++) {
            if (array[i] == 1) {
                min++;
                max++;
            }
        }
        int m = 0;
        for (int i = 0; i < 8; i++) {
            if (array[i] == 1) {
                m++;
            }
        }
        min = Math.max(1, m);
        System.out.println(min + " " + (max + count));
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
}
