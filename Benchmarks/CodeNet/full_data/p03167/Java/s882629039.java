import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter pw;
    static Scanner sc;
    static long ceildiv(long x, long y){ return (x+y-1)/y;}
    public static void main(String[] args) throws Exception {
        sc= new Scanner(System.in);
        pw=new PrintWriter(System.out);
//        int t=sc.nextInt();
        int mod=(int)1e9+7;
//        while(t-->0){
            int n=sc.nextInt(), m=sc.nextInt();
            int[][] dp=new int[n][m];
            char[][] arr=new char[n][];
            for(int i=0; i<n; i++)
                arr[i]=sc.nextLine().toCharArray();
            for(int i=0; i<n; i++){
                if(arr[i][0]=='#')
                    break;
                dp[i][0]=1;
            }
            for(int j=0; j<m; j++){
                if(arr[0][j]=='#')
                    break;
                dp[0][j]=1;
            }
            for(int i=1; i<n; i++){
                for(int j=1; j<m; j++) {
                    if(arr[i][j]!='#')
                        dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % mod;
                }
            }
            pw.println(dp[n-1][m-1]);
//        }
        pw.close();
    }
    static void printArr(int[] arr){
        for(int i=0; i<arr.length-1; i++)
            pw.print(arr[i]+" ");
        pw.println(arr[arr.length-1]);
    }
    static void printArr(long[] arr){
        for(int i=0; i<arr.length-1; i++)
            pw.print(arr[i]+" ");
        pw.println(arr[arr.length-1]);
    }
    static void printArr(Integer[] arr){
        for(int i=0; i<arr.length-1; i++)
            pw.print(arr[i]+" ");
        pw.println(arr[arr.length-1]);
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

        public int[] nextArr(int n) throws IOException {
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++)
                arr[i] = nextInt();
            return arr;
        }
        public Integer[] nextsort(int n) throws IOException{
            Integer[] arr=new Integer[n];
            for(int i=0; i<n; i++)
                arr[i]=nextInt();
            return arr;
        }
        public Pair nextPair() throws IOException{
            return new Pair(nextInt(), nextInt());
        }
        public Pair[] nextPairArr(int n, int l) throws IOException{
            Pair[] arr=new Pair[n];
            if(l==2){
                int[] a=nextArr(n), b=nextArr(n);
                for(int i=0; i<n; i++)
                    arr[i]=new Pair(a[i], b[i]);
                return arr;
            }
            for(int i=0; i<n; i++)
                arr[i]=new Pair(nextInt(), nextInt());
            return arr;
        }
        public boolean ready() throws IOException {
            return br.ready();
        }
    }
    static class Pair implements Comparable<Pair>{
        int x;
        int y;
        public Pair(int x, int y) {
            this.x=x;
            this.y=y;
        }
        public int hashCode() {
            return this.x*1000+this.y;
        }
        public int compareTo(Pair other) {
            if(this.y!=other.y)
                return this.y-other.y;
            return this.x-other.x;
        }
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (this.getClass() != obj.getClass()) {
                return false;
            }
            Pair p = (Pair) obj;
            if(this.x==p.x)
                return this.y==p.y;
            if(this.x==p.y)
                return this.y==p.x;
            else
                return false;
        }
        public boolean equal(Pair p){
            if(this.x==p.x)
                return this.y==p.y;
            if(this.x==p.y)
                return this.y==p.x;
            else
                return false;
        }
    }
}
