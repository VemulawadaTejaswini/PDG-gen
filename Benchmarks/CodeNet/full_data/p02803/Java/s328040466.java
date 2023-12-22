            
import java.util.*;import java.io.*;import java.math.*;

public class Main
{
    static int dp[][];
    static boolean visited[][];
    static class Node{
        int r,c,dist;
        public Node(int r,int c,int dist){
            this.r=r;
            this.c=c;
            this.dist=dist;
        }
    }

    static boolean isValid(int i,int j,int h,int w){
        if(i<1 || i>h || j<1 || j>w || visited[i][j])
            return false;
        return true;
    }

    static void find_path(int sr,int sc,int h,int w,char grid[][]){
        Queue<Node> q=new LinkedList<>();
        q.add(new Node(sr,sc,0));
        visited[sr][sc]=true;
        for(int i=1;i<=h;i++)
            for(int j=1;j<=w;j++)
                if(grid[i][j]=='#')
                    visited[i][j]=true;

        while(!q.isEmpty()){
            Node n=q.poll();
            int r=n.r,c=n.c,dist=n.dist;

            dp[r][c]=Math.max(dp[r][c], dist);

            dist++;
            if(isValid(r+1,c,h,w)){
                q.add(new Node(r+1,c,dist));
                visited[r+1][c]=true;
            }

            if(isValid(r-1,c,h,w)){
                q.add(new Node(r-1,c,dist));
                visited[r-1][c]=true;
            }

            if(isValid(r,c+1,h,w)){
                q.add(new Node(r,c+1,dist));
                visited[r][c+1]=true;
            }

            if(isValid(r,c-1,h,w)){
                q.add(new Node(r,c-1,dist));
                visited[r][c-1]=true;
            }
        }
    }
    public static void process()throws IOException
    {
        int h=ni(),w=ni();
        dp=new int[h+1][w+1];
        visited=new boolean[h+1][w+1];
        for(int row[] : dp)
            Arrays.fill(row,-1);

        char grid[][]=new char[h+1][w+1];
        for(int i=1;i<=h;i++) grid[i]=(" "+nln()).toCharArray();

        for(int i=1;i<=h;i++){
            for(int j=1;j<=w;j++){
                if(grid[i][j]=='#')
                    continue;
                find_path(i,j,h,w,grid);

                for(boolean row[] : visited)
                    Arrays.fill(row,false);
            }
        }

        int res=0;
        for(int i=1;i<=h;i++)
            for(int j=1;j<=w;j++)
                res=Math.max(res, dp[i][j]);

        pn(res);
    }


    static AnotherReader sc;
    static PrintWriter out;
    public static void main(String[]args)throws IOException
    {
        out = new PrintWriter(System.out);
        sc=new AnotherReader();
        boolean oj = true;

       // oj = System.getProperty("ONLINE_JUDGE") != null;
        if(!oj) sc=new AnotherReader(100);

        long s = System.currentTimeMillis();
        int t=1;
        //t=ni();
        while(t-->0)
            process();
        out.flush();
        if(!oj)
            System.out.println(System.currentTimeMillis()-s+"ms");
        System.out.close();  
    }
    
    
    static void pn(Object o){out.println(o);}
    static void p(Object o){out.print(o);}
    static void pni(Object o){out.println(o);System.out.flush();}
    static int ni()throws IOException{return sc.nextInt();}
    static long nl()throws IOException{return sc.nextLong();}
    static double nd()throws IOException{return sc.nextDouble();}
    static String nln()throws IOException{return sc.nextLine();}
    static long gcd(long a, long b)throws IOException{return (b==0)?a:gcd(b,a%b);}
    static int gcd(int a, int b)throws IOException{return (b==0)?a:gcd(b,a%b);}
    static int bit(long n)throws IOException{return (n==0)?0:(1+bit(n&(n-1)));}
    static boolean multipleTC=false;
    static long mod=(long)1e9+7l;
    static long mpow(long x, long n) {
        if(n == 0)
            return 1;
        if(n % 2 == 0) {
            long root = mpow(x, n / 2);
            return root * root % mod;
        }else {
            return x * mpow(x, n - 1) % mod;
        }
    }
    static long mcomb(long a, long b) {
        if(b > a - b)
            return mcomb(a, a - b);
        long m = 1;
        long d = 1;
        long i;
        for(i = 0; i < b; i++) {
            m *= (a - i);
            m %= mod;
            d *= (i + 1);
            d %= mod;
        }
        long ans = m * mpow(d, mod - 2) % mod;
        return ans;
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////

    static class AnotherReader{BufferedReader br; StringTokenizer st;
    AnotherReader()throws FileNotFoundException{
    br=new BufferedReader(new InputStreamReader(System.in));}
    AnotherReader(int a)throws FileNotFoundException{
    br = new BufferedReader(new FileReader("input.txt"));}
    String next()throws IOException{
    while (st == null || !st.hasMoreElements()) {try{
    st = new StringTokenizer(br.readLine());}
    catch (IOException  e){ e.printStackTrace(); }}
    return st.nextToken(); } int nextInt() throws IOException{
    return Integer.parseInt(next());}
    long nextLong() throws IOException
    {return Long.parseLong(next());}
    double nextDouble()throws IOException { return Double.parseDouble(next()); }
    String nextLine() throws IOException{ String str = ""; try{
    str = br.readLine();} catch (IOException e){
    e.printStackTrace();} return str;}}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
}