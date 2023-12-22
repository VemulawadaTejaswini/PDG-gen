import java.util.*;
import java.io.*;
import java.util.zip.Adler32;

public class Main {
    static long[][]memo1,memo2[];
    static int mod = 998244353;
    static int n,k;
    static long countpairs(int pre,int rem,int all){
        if (rem<0)
            return 0;
        if (rem==0&&all!=0)
            return 0;
        if (all==0)
            return 1;
        if (memo2[pre][rem][all]!=-1)
            return memo2[pre][rem][all];
        long ans=0;
        if(pre==1){
            ans+=countpairs(1,rem,all-1);
            ans+=countpairs(0,rem-1,all);
            ans%=mod;
        }
        else {
            ans+=2*countpairs(1,rem,all-1);
            ans+=countpairs(0,rem-1,all);
            ans%=mod;
        }
        return memo2[pre][rem][all]=ans;
    }
    static long dp (int rem,int all){
        if (rem<0||(rem==0&&all!=0))
            return 0;
        if (all==0)
            return 1;
        if (memo1[rem][all]!=-1)
            return memo1[rem][all];
        long ans= dp(rem-1,all)+dp(rem,all-1);
        return memo1[rem][all]=ans%mod;
    }

    static long calc(int num,int pairs,int size){
        int non = size-2*pairs;
        long res=0;
        for (int i =0;i<=num;i++){
            res+=dp(non,i)*countpairs(0,pairs,num-i);
            res%=mod;
        }
        return res;
    }
    static int countp(int x){
        int ans=0;
        for (int i =1;i<=k;i++){
            if (x-i>=1&&x-i<=k&&x-i>i)
                ans++;
        }
        return ans;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);;
        k = sc.nextInt();
        n = sc.nextInt();
        memo1= new long[2001][2001];
        memo2= new long[2][2001][2001];
        for (long[]x:memo1)Arrays.fill(x,-1);
        for (long[][]z:memo2)for (long[]x:z)Arrays.fill(x,-1);

        for (int i =2;i<=2*k;i++){
            if (i%2==0){
               long ans=calc(n-1,countp(i),k-1);
               ans+=calc(n,countp(i),k-1);
               ans%=mod;
               pw.println(ans);
            }else {
                pw.println(calc(n,countp(i),k));
            }
        }
        pw.flush();
    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(FileReader r) {
            br = new BufferedReader(r);
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
            return Double.parseDouble(next());
        }

        public int[] nextIntArr(int n) throws IOException {
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++)
                arr[i] = nextInt();
            return arr;
        }

        public boolean ready() throws IOException {
            return br.ready();
        }

    }
}