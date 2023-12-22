import java.io.*;
import java.util.*;
public class Main {
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////                                                                                                               /////////
////////                                                                                                               /////////
////////   HHHH        HHHH  EEEEEEEEEEEEE   MMMM          MMMM         OOOOOO             SSSSSSS      EEEEEEEEEEEEE  /////////
////////   HHHH        HHHH  EEEEEEEEEEEEE   MMMMMM      MMMMMM      OOO      OOO        SSSS   SSS     EEEEEEEEEEEEE  /////////
////////   HHHH        HHHH  EEEEE           MMMM MMM  MMM MMMM    OOO          OOO    SSSS       SSS   EEEEE          /////////
////////   HHHH        HHHH  EEEEE           MMMM  MMMMMM  MMMM   OOO            OOO   SSSS             EEEEE          /////////
////////   HHHH        HHHH  EEEEE           MMMM          MMMM  OOO              OOO   SSSSSSS         EEEEE          /////////
////////   HHHHHHHHHHHHHHHH  EEEEEEEEEEE     MMMM          MMMM  OOO              OOO      SSSSSS       EEEEEEEEEEE    /////////
////////   HHHHHHHHHHHHHHHH  EEEEEEEEEEE     MMMM          MMMM  OOO              OOO         SSSSSSS   EEEEEEEEEEE    /////////
////////   HHHH        HHHH  EEEEE           MMMM          MMMM   OOO            OOO              SSSS  EEEEE          /////////
////////   HHHH        HHHH  EEEEE           MMMM          MMMM    OOO          OOO     SSS       SSSS  EEEEE          /////////
////////   HHHH        HHHH  EEEEEEEEEEEEE   MMMM          MMMM      OOO      OOO        SSS    SSSS    EEEEEEEEEEEEE  /////////
////////   HHHH        HHHH  EEEEEEEEEEEEE   MMMM          MMMM         OOOOOO             SSSSSSS      EEEEEEEEEEEEE  /////////
////////                                                                                                               /////////
////////                                                                                                               /////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    static int mod = (int) (1e9 + 7);
    // static int n;
    static StringBuilder sol;

    static class pair implements Comparable<pair> {
        int left, type;
        double w;
        public pair(int x, double y) {
            left = x;
            w = y;
            type= 0;
        }

        public int compareTo(pair o) {
            return Double.compare(w,o.w);
        }

        public String toString() {
            return left + " " + w;
        }
    }

    static class tri implements Comparable<tri> {
        int st, end,len, side;

        tri(int a, int b, int c,int d) {
            st = a;
            end = b;
            len = c;
            side=d;
        }

        public int compareTo(tri o) {
            if (st == o.st) return end - o.end;
            return st - o.st;
        }

        public String toString() {
            return st + " " + end ;
        }
    }
   static long[][]memo;
    static int[]a,b;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        //FileWriter f = new FileWriter("C:\\Users\\Ibrahim\\out.txt");
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        int[]a= new int[n];
        int[]b= new int[n];
        int []c= new int[n];
        for (int i =0;i<n;i++){
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
            c[i]=sc.nextInt();
        }
        long[][]memo= new long[3][n+1];
        Arrays.fill(memo[0],100000000000000000l);
        Arrays.fill(memo[1],100000000000000000l);
        Arrays.fill(memo[2],100000000000000000l);
        memo[0][n]=0;
        memo[1][n]=0;
        memo[2][n]=0;
        for (int i=n-1;i>=0;i--){
            memo[0][i]=a[i]+Math.max(memo[1][i+1],memo[2][i+1]);
            memo[1][i]=b[i]+Math.max(memo[0][i+1],memo[2][i+1]);
            memo[2][i]=c[i]+Math.max(memo[1][i+1],memo[0][i+1]);
        }
        pw.println(Math.max(memo[0][0],Math.max(memo[1][0],memo[2][0])));
        pw.flush();
    }
    static long gcd(long a ,long b){
        if (a==0)return b;
        return gcd(b%a,a);
    }
    static int inver(long x,int mod){
        int a = (int) x;
        int e=(mod-2);
        int res = 1;
        while(e > 0)
        {
            if((e & 1) == 1) {
                //System.out.println(res*a);
                res = (int) ((1l*res * a) % mod);
            }
            a = (int) ((1l*a * a) % mod);
            e >>= 1;
        }
        //out.println(res+" "+x);
        return res%mod;
    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(FileReader r) {
            br = new BufferedReader(r);
        }

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public double nextDouble() throws IOException {
            String x = next();
            StringBuilder sb = new StringBuilder("0");
            double res = 0, f = 1;
            boolean dec = false, neg = false;
            int start = 0;
            if (x.charAt(0) == '-') {
                neg = true;
                start++;
            }
            for (int i = start; i < x.length(); i++)
                if (x.charAt(i) == '.') {
                    res = Long.parseLong(sb.toString());
                    sb = new StringBuilder("0");
                    dec = true;
                } else {
                    sb.append(x.charAt(i));
                    if (dec)
                        f *= 10;
                }
            res += Long.parseLong(sb.toString()) / f;
            return res * (neg ? -1 : 1);
        }

        public boolean ready() throws IOException {
            return br.ready();
        }
    }
}