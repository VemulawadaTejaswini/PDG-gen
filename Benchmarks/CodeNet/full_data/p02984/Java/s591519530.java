

import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static FastScanner sc = new FastScanner(System.in);
    static int INF = 12345678;
    static long MOD = 1000000007;
    static int[] y4 = {0, 1, 0, -1};
    static int[] x4 = {1, 0, -1, 0};
    static int[] y8 = {0, 1, 0, -1, -1, 1, 1, -1};
    static int[] x8 = {1, 0, -1, 0, 1, -1, 1, -1};
    static long[] F;//factorial
    static boolean[] isPrime;
    static int[] primes;
    static char[][] map;

    static int N, M;
    static long T;
    static int[] A;


    public static void main(String[] args) {

        int n = sc.nextInt();

        long[] array = sc.nextLongArray(n);
        long[] ans = new long[n];

        StringBuilder sb = new StringBuilder();

        long mid;

        long l = 0;
        long r = 2000000020;

        boolean f = false;
        boolean skip = false;

        while(true){
            f = false;
            mid = (r + l) / 2;
            long temp = mid;

            for(int i = 0;i < n;i++){
                ans[i] = temp;
                temp = 2*array[i] - temp;

                if(temp < 0){
                    skip = true;
                    if(!f) {
                        r = mid;

                        break;
                    }else{
                        l = mid;
//                        System.out.println("l");
                        break;
                    }
                }
                f = !f;

            }
            if(!skip) {
                if (mid == temp) {

                    for (long i : ans) {
                        sb.append(i);
                        sb.append(" ");
                    }

                    System.out.println(sb.toString());

                    break;
                } else {
                    if (mid - temp > 0) {
                        r = mid;
                    } else {
                        l = mid;
                    }
                }
            }
            skip = false;

        }


    }

    static int max(int... a) {
        int res = Integer.MIN_VALUE;
        for (int i : a) {
            res = Math.max(res, i);
        }
        return res;
    }

    static long max(long... a) {
        long res = Long.MIN_VALUE;
        for (long i : a) {
            res = Math.max(res, i);
        }
        return res;
    }


    static int max(int[][] ar) {
        int res = Integer.MIN_VALUE;
        for (int i[] : ar)
            res = Math.max(res, max(i));
        return res;
    }

    static int min(int... a) {
        int res = Integer.MAX_VALUE;
        for (int i : a) {
            res = Math.min(res, i);
        }
        return res;
    }

    static long min(long... a) {
        long res = Long.MAX_VALUE;
        for (long i : a) {
            res = Math.min(res, i);
        }
        return res;
    }

    static int min(int[][] ar) {
        int res = Integer.MAX_VALUE;
        for (int i[] : ar)
            res = Math.min(res, min(i));
        return res;
    }

    static int sum(int[] a) {
        int cou = 0;
        for (int i : a)
            cou += i;
        return cou;
    }

    static int abs(int a) {
        return Math.abs(a);
    }


    static long abs(long a) {
        return Math.abs(a);
    }

    static class FastScanner {

        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        public String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        /*public String nextChar(){
            return (char)next()[0];
        }*/
        public String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            return tokenizer.nextToken("\n");
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            return a;
        }

        public int[] nextIntArrayDec(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt() - 1;
            }
            return a;
        }

        public int[][] nextIntArray2(int h, int w) {
            int[][] a = new int[h][w];
            for (int hi = 0; hi < h; hi++) {
                for (int wi = 0; wi < w; wi++) {
                    a[hi][wi] = nextInt();
                }
            }
            return a;
        }

        public int[][] nextIntArray2Dec(int h, int w) {
            int[][] a = new int[h][w];
            for (int hi = 0; hi < h; hi++) {
                for (int wi = 0; wi < w; wi++) {
                    a[hi][wi] = nextInt() - 1;
                }
            }
            return a;
        }

        //複数の配列を受け取る
        public void nextIntArrays2ar(int[] a, int[] b) {
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
                b[i] = sc.nextInt();
            }
        }

        public void nextIntArrays2arDec(int[] a, int[] b) {
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt() - 1;
                b[i] = sc.nextInt() - 1;
            }
        }

        //複数の配列を受け取る
        public void nextIntArrays3ar(int[] a, int[] b, int[] c) {
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
                b[i] = sc.nextInt();
                c[i] = sc.nextInt();
            }
        }

        //複数の配列を受け取る
        public void nextIntArrays3arDecLeft2(int[] a, int[] b, int[] c) {
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt() - 1;
                b[i] = sc.nextInt() - 1;
                c[i] = sc.nextInt();
            }
        }

        public Integer[] nextIntegerArray(int n) {
            Integer[] a = new Integer[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            return a;
        }

        public char[] nextCharArray(int n) {
            char[] a = next().toCharArray();

            return a;
        }

        public char[][] nextCharArray2(int h, int w) {
            char[][] a = new char[h][w];
            for (int i = 0; i < h; i++) {
                a[i] = next().toCharArray();
            }
            return a;
        }

        //スペースが入っている場合
        public char[][] nextCharArray2s(int h, int w) {
            char[][] a = new char[h][w];
            for (int i = 0; i < h; i++) {
                a[i] = nextLine().replace(" ", "").toCharArray();
            }
            return a;
        }

        public char[][] nextWrapCharArray2(int h, int w, char c) {
            char[][] a = new char[h + 2][w + 2];
            //char c = '*';
            int i;
            for (i = 0; i < w + 2; i++)
                a[0][i] = c;
            for (i = 1; i < h + 1; i++) {
                a[i] = (c + next() + c).toCharArray();
            }
            for (i = 0; i < w + 2; i++)
                a[h + 1][i] = c;
            return a;
        }

        //スペースが入ってる時用
        public char[][] nextWrapCharArray2s(int h, int w, char c) {
            char[][] a = new char[h + 2][w + 2];
            //char c = '*';
            int i;
            for (i = 0; i < w + 2; i++)
                a[0][i] = c;
            for (i = 1; i < h + 1; i++) {
                a[i] = (c + nextLine().replace(" ", "") + c).toCharArray();
            }
            for (i = 0; i < w + 2; i++)
                a[h + 1][i] = c;
            return a;
        }

        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextLong();
            }
            return a;
        }

        public long[][] nextLongArray2(int h, int w) {
            long[][] a = new long[h][w];
            for (int hi = 0; hi < h; hi++) {
                for (int wi = 0; wi < w; wi++) {
                    a[hi][wi] = nextLong();
                }
            }
            return a;
        }
    }
}
