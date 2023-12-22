
import java.io.*;
import java.lang.reflect.Array;
import java.math.*;
import java.util.*;
@SuppressWarnings("Duplicates")
// author @mdazmat9
public class Main{
    static FastScanner sc = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] args) throws IOException {
        int test = 1;
      // test = sc.nextInt();
        for (int ind = 0; ind < test; ind++) {
            solve();
        }
        out.flush();
    }
    static void solve() {
        n=sc.nextInt();
        m=sc.nextInt();
        a=new char[n][];
        for(int i=0;i<n;i++){
            String s=sc.next();
            a[i]=s.toCharArray();
        }
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i][j]=='.'){
                    ans=Math.max(ans,bfs(i,j));
                }
            }
        }
        out.println(ans);
    }
static int n,m;
   static char a[][];
  static  int bfs(int sx,int sy){
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(sx,sy));
        int count=0;
        boolean visited[][]=new boolean[n][m];
        int matrix[][]=new int[n][m];
        for(int i=0;i<n;i++)for(int j=0;j<m;j++)matrix[i][j]=Integer.MAX_VALUE;
        matrix[sx][sy]=0;
        int mx=0;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                Pair x=q.poll();
                sx=x.getKey();sy=x.getValue();
                visited[sx][sy]=true;
                matrix[sx][sy]=Math.min(matrix[sx][sy],count);
                mx=Math.max(mx,matrix[sx][sy]);
                if(sx+1<n && !visited[sx+1][sy] && a[sx+1][sy]!='#'){
                    q.add(new Pair(sx+1,sy));
                }
                if(sx-1>=0 && !visited[sx-1][sy] && a[sx-1][sy]!='#'){
                    q.add(new Pair(sx-1,sy));
                }

                if(sy+1<m && !visited[sx][sy+1] && a[sx][sy+1]!='#'){
                    q.add(new Pair(sx,sy+1));
                }

                if(sy-1>=0 && !visited[sx][sy-1] && a[sx][sy-1]!='#'){
                    q.add(new Pair(sx,sy-1));
                }
            }
            count++;
        }
        return mx;
    }
   static class Pair{
      int x,y;
      Pair(int x,int y){
          this.x=x;
          this.y=y;
      }
      int getKey(){
          return x;
      }
      int getValue(){
          return y;
      }
    }



    static int[] intarray(int n){ int [] a=new int[n];for(int i=0;i<n;i++)a[i]=sc.nextInt();return a; }
    static void sort(int[]a){ shuffle(a);Arrays.sort(a);}
    static void sort(long[]a){ shuffle(a);Arrays.sort(a);}
    static long[] longarray(int n){ long [] a=new long[n];for(int i=0;i<n;i++)a[i]=sc.nextLong();return a; }
    static ArrayList<Integer> intlist(int n){ArrayList<Integer> list=new ArrayList<>();for(int i=0;i<n;i++)list.add(sc.nextInt());return list; }
    static ArrayList<Long> longlist(int n){ArrayList<Long> list=new ArrayList<>();for(int i=0;i<n;i++)list.add(sc.nextLong());return list; }
    static int[][] int2darray(int n,int m){ int [][] a=new int[n][m];for(int i=0;i<n;i++){ for(int j=0;j<m;j++){ a[i][j]=sc.nextInt(); } }return a; }
    static long[][] long2darray(int n,int m){ long [][] a=new long[n][m];for(int i=0;i<n;i++){ for(int j=0;j<m;j++){ a[i][j]=sc.nextLong(); } }return a; }
    static char[][] char2darray(int n,int m){ char [][] a=new char[n][m];for(int i=0;i<n;i++){ String s=sc.next(); a[i]=s.toCharArray(); }return a; }

    static double pi=3.14159265358979323846264;
    public static double logb( double a, double b ) {return Math.log(a) / Math.log(b); }
    static long fast_pow(long a, long b,long abs) {
        if(b == 0) return 1L;
        long val = fast_pow(a, b / 2,abs);
        if(b % 2 == 0) return val * val % abs;
        else return val * val % abs * a % abs;
    }
    static long abs = (long)1e9 + 7;
    static   void shuffle(int[] a) { int n = a.length;for(int i = 0; i < n; i++) { int r = i + (int) (Math.random() * (n - i));int tmp = a[i];a[i] = a[r];a[r] = tmp; } }
    static   void shuffle(long[] a) { int n = a.length;for(int i = 0; i < n; i++) { int r = i + (int) (Math.random() * (n - i));long tmp = a[i];a[i] = a[r];a[r] = tmp; } }
    static long gcd(long a , long b) {
        if(b == 0) return a;
        return gcd(b , a % b);
    }
}
 class FastScanner {
    BufferedReader br;
    StringTokenizer st;

    public FastScanner() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException  e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    double nextDouble() {
        return Double.parseDouble(next());
    }

    String nextLine() {
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}


