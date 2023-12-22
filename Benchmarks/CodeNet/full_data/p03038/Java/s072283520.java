import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

import java.io.*;
import java.math.*;
import java.util.*;
import java.lang.*;

public class Main implements Runnable {
    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;
        private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1)
                throw new InputMismatchException();

            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        public int nextInt() {
            int c = read();

            while (isSpaceChar(c))
                c = read();

            int sgn = 1;

            if (c == '-') {
                sgn = -1;
                c = read();
            }

            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));

            return res * sgn;
        }

        public long nextLong() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;

            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));
            return res * sgn;
        }

        public double nextDouble() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            double res = 0;
            while (!isSpaceChar(c) && c != '.') {
                if (c == 'e' || c == 'E')
                    return res * Math.pow(10, nextInt());
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            if (c == '.') {
                c = read();
                double m = 1;
                while (!isSpaceChar(c)) {
                    if (c == 'e' || c == 'E')
                        return res * Math.pow(10, nextInt());
                    if (c < '0' || c > '9')
                        throw new InputMismatchException();
                    m /= 10;
                    res += (c - '0') * m;
                    c = read();
                }
            }
            return res * sgn;
        }

        public String readString() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            }
            while (!isSpaceChar(c));

            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public String next() {
            return readString();
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
        }
    }

    public static void main(String args[]) throws Exception {
        new Thread(null, new Main(), "Main", 1 << 26).start();
    }

    static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    static long modPow(long a, long p, long m) {
        if (a == 1) return 1;
        long ans = 1;
        while (p > 0) {
            if (p % 2 == 1) ans = (ans * a) % m;
            a = (a * a) % m;
            p >>= 1;
        }
        return ans;
    }

    static long modInv(long a, long m) {
        return modPow(a, m - 2, m);
    }

    static long sol_x, sol_y, gcd_a_b;

    static void extendedEuclid(long a, long b) {
        if (b == 0) {
            gcd_a_b = a;
            sol_x = 1;
            sol_y = 0;
        } else {
            extendedEuclid(b, a % b);
            long temp = sol_x;
            sol_x = sol_y;
            sol_y = temp - (a / b) * sol_y;
        }
    }

    long modInverse(long a, long prime)
    {
        a = a % prime;
        for (int x=1; x<prime; x++)
            if ((a*x) % prime == 1)
                return x;

        return -1;
    }

    static class Bhavansort {
        Random random;

        Bhavansort(int a[]) {
            randomArray(a);
            sort(a);
        }

        Bhavansort(long a[]) {
            randomArray(a);
            sort(a);
        }

        static int[] sort(int a[]) {
            Arrays.sort(a);
            return a;
        }

        static long[] sort(long a[]) {
            Arrays.sort(a);
            return a;
        }

        void randomArray(long a[]) {
            int n = a.length;
            for (int i = 0; i < n; i++) {
                int p = random.nextInt(n) % n;
                long tm = a[i];
                a[i] = a[p];
                a[p] = tm;
            }
        }

        void randomArray(int a[]) {
            int n = a.length;
            for (int i = 0; i < n; i++) {
                int p = random.nextInt(n) % n;
                int tm = a[i];
                a[i] = a[p];
                a[p] = tm;
            }
        }
    }


    public void run() {
        InputReader sc = new InputReader(System.in);
        //Scanner sc=new Scanner(System.in);
        // Random rn=new Random();
        PrintWriter out = new PrintWriter(System.out);

        int n=sc.nextInt();
        int m=sc.nextInt();
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for (int i = 0; i <n ; i++) {
            pq.add(sc.nextInt());
        }

        int a[][]=new int[m][2];
        for (int i = 0; i <m ; i++) {
            a[i][0]=sc.nextInt();
            a[i][1]=sc.nextInt();
        }

        Arrays.sort(a, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o2[1],o1[1]);
            }
        });

        for (int i = 0; i <m ; i++) {
            while(a[i][1]>pq.peek() && a[i][0]>0){
                pq.remove();
                pq.add(a[i][1]);
                a[i][0]--;
            }
            if(a[i][0]!=0){
                break;
            }
        }

        long sum=0;
        while (!pq.isEmpty()){
            sum+=pq.remove();
        }
        out.println(sum);


        out.close();
    }



 }