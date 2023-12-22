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

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        //FileWriter f = new FileWriter("C:\\Users\\Ibrahim\\out.txt");
        PrintWriter pw = new PrintWriter(System.out);
         int n = sc.nextInt();
         int[]a= new int[n+1];
         int [] c= new int[n+1];
         for (int i =1;i<=n;i++){
             a[i]=sc.nextInt();
         }
         for (int i =1;i<=n;i++){
             if (a[i]==1){
                 Queue<Integer>div= new LinkedList<>();
                 ((LinkedList<Integer>) div).add(1);
                 if (i>1)
                 ((LinkedList<Integer>) div).add(i);
                 for (int j=2;j<=Math.sqrt(i);j++){
                     if (i%j==0){
                         ((LinkedList<Integer>) div).add(j);
                         if (j!=i/j){
                             ((LinkedList<Integer>) div).add(i/j);
                         }
                     }
                 }
                 boolean f=false;
                 while (!div.isEmpty()){
                     int x = div.poll();
                     if (c[x]==1)f=true;
                 }
                 if (!f)c[i]=1;
                 else a[i]=0;
             }
        }
        boolean ok=true;
         int ans =0;
         StringBuilder sol= new StringBuilder();
        for (int i =1;i<=n;i++){
            //c[i]%=2;
             if (a[i]!=c[i]%2)ok=false;
             if (a[i]==1){
                 sol.append(i+" ");
                 ans++;
             }
        }
      //  pw.println(Arrays.toString(c));
        if (ok){
            pw.println(ans);
            pw.println(sol.toString().trim());
        }
        else pw.println(-1);
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