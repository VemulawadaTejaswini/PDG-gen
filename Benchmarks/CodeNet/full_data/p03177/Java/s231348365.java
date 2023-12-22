import java.io.*;
import java.lang.reflect.Array;
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
    static int[] anss,count ;
    static long mod;
    static int[][] matMul(int[][] A, int[][] B, int p, int q, int r)	//C(p x r) = A(p x q) x (q x r) -- O(p x q x r)
    {
        int[][] C = new int[p][r];
        for(int i = 0; i < p; ++i)
            for(int j = 0; j < r; ++j)
                for(int k = 0; k < q; ++k) {
                    C[i][j] += (1l * A[i][k] * B[k][j]) % mod;
                    C[i][j]%=mod;
        }
        return C;
    }

    /*
     * 4. Square Matrix Exponentiation
     */
    static int[][] matPow(int[][] base, long p)
    {
        int n = base.length;
        int[][] ans = new int[n][n];
        for(int i = 0; i < n; i++)
            ans[i][i] = 1;
        while(p != 0)
        {
            if((p & 1) == 1)
                ans = matMul(ans, base, n, n, n);
            base = matMul(base, base, n, n, n);
            p >>= 1;
        }

        return ans;
    }
    public static void main(String[]args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
//        Thread.sleep(3000);
        mod= (long) (1e9+7);
        int n = sc.nextInt();
        long k = sc.nextLong();
        int[][]base= new int[n][n];
        for (int i =0;i<n;i++){
            for (int j = 0;j<n;j++)base[i][j]=sc.nextInt();
        }
        base=matPow(base,k);
        int[][]mul= new int[n][1];
        for (int i =0;i<n;i++)mul[i][0]=1;
        int[][]ans=matMul(base,mul,n,n,1);
        long ret=0;
        for (int i =0;i<n;i++){
            ret+=ans[i][0];
            ret%=mod;
        }
        pw.println(ret);
        pw.flush();
    }
    static boolean isp(long x){
        if (x<isComposite.length){
            int idx =(int)x;
            if (isComposite[idx]==0)return true;
            else return false;
        }
        else {
            for (int p :primes){
                if (x%p==0)return false;
            }
            return true;
        }
    }
    static long x, y, d;
    static void extendedEuclid(long a, long b)
    {
        if(b == 0) { x = 1; y = 0; d = a; return; }
        extendedEuclid(b, a % b);
        long x1 = y;
        long y1 = x - a / b * y;
        x = x1; y = y1;
    }
    static int gcd(int a,int b){
        if (a==0)return b;
        return gcd(b%a,a);
    }
    static ArrayList<Integer> primes;
    static int[] isComposite;
    static void sieve(int N)    // O(N log log N)
    {
        isComposite = new int[N + 1];
        isComposite[0] = isComposite[1] = 1;            // 0 indicates a prime number
        primes = new ArrayList<>(3*1000000);
        anss= new int[N+1];
        for (int i = 2; i <= N; ++i)                    //can loop till i*i <= N if primes array is not needed O(N log log sqrt(N))
            if (isComposite[i] == 0)                    //can loop in 2 and odd integers for slightly better performance
            {
                primes.add(i);
                if (1l * i * 2 <= N)
                    for (int j = i * 2; j <= N; j += i) {    // j = i * 2 will not affect performance too much, may alter in modified sieve
                        isComposite[j] = 1;
                        if (anss[j]==0)anss[j]=i;
                }
            }
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
