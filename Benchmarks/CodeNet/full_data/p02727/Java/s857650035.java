import java.util.*;import java.io.*;import java.math.*;
public class Main
{
    public static void process()throws IOException
    {
        int x=ni();
        int y=ni();
        int a=ni();
        int b=ni();
        int c=ni();
        int[]R=new int[a+1];
        for(int i=0;i<a;i++)
            R[i]=ni();
        R[a]=0;
        int[]G=new int[b+1];
        for(int i=0;i<b;i++)
            G[i]=ni();
        G[b]=0;
        int[]C=new int[c+1];
        for(int i=0;i<c;i++)
            C[i]=ni();
        C[c]=0;
        Arrays.sort(R);
        Arrays.sort(G);
        Arrays.sort(C);
        long ans=0;
        int p1=a,p2=b,p3=c;
        for(int i=0;i<x;i++)
        {
            if(R[p1]>=C[p3])
            {
                p1--;
                ans+=R[p1+1];
            }
            else
            {
                p3--;
                ans+=C[p3+1];
            }
        }
        for(int i=0;i<y;i++)
        {
            if(G[p2]>=C[p3])
            {
                p2--;
                ans+=G[p2+1];
            }
            else
            {
                p3--;
                ans+=C[p3+1];
            }
        }
        long ans1=0;
        p1=a;
        p2=b;
        p3=c;
        for(int i=0;i<y;i++)
        {
            if(G[p2]>=C[p3])
            {
                p2--;
                ans1+=G[p2+1];
            }
            else
            {
                p3--;
                ans1+=C[p3+1];
            }
        }
        for(int i=0;i<x;i++)
        {
            if(R[p1]>=C[p3])
            {
                p1--;
                ans1+=R[p1+1];
            }
            else
            {
                p3--;
                ans1+=C[p3+1];
            }
        }
        pn(Math.max(ans,ans1));
    }

    static AnotherReader sc;
    static PrintWriter out;
    public static void main(String[]args)throws IOException
    {
        boolean oj = true;
        if(oj){sc=new AnotherReader();out=new PrintWriter(System.out);}
        else{sc=new AnotherReader(100);out=new PrintWriter("output.txt");}
        int t=1;
        // t=ni();
        while(t-->0) {process();}
        out.flush();out.close();  
    }

    static void pn(Object o){out.println(o);}
    static void p(Object o){out.print(o);}
    static void pni(Object o){out.println(o);out.flush();}
    static int ni()throws IOException{return sc.nextInt();}
    static long nl()throws IOException{return sc.nextLong();}
    static double nd()throws IOException{return sc.nextDouble();}
    static String nln()throws IOException{return sc.nextLine();}
    static int[] nai(int N)throws IOException{int[]A=new int[N];for(int i=0;i!=N;i++){A[i]=ni();}return A;}
    static long[] nal(int N)throws IOException{long[]A=new long[N];for(int i=0;i!=N;i++){A[i]=nl();}return A;}
    static long gcd(long a, long b)throws IOException{return (b==0)?a:gcd(b,a%b);}
    static int gcd(int a, int b)throws IOException{return (b==0)?a:gcd(b,a%b);}
    static int bit(long n)throws IOException{return (n==0)?0:(1+bit(n&(n-1)));}

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