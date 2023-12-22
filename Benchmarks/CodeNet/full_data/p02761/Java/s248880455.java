import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String []args) throws IOException {
    	FastScanner in  = new FastScanner(System.in);
    	PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)), false);
    	solve(in, out);
    	in.close();
    	out.close();
    }
    static long gcd(long a, long b){ return (b==0) ? a : gcd(b, a%b); }
    static int gcd(int a, int b){ return (b==0) ? a : gcd(b, a%b); }
    static class FastScanner{
	BufferedReader reader;
	StringTokenizer st;
	FastScanner(InputStream stream){reader=new BufferedReader(new InputStreamReader(stream));st=null;}
	String next(){while(st == null || !st.hasMoreTokens()){try{String line = reader.readLine();if(line == null){return null;}
	     st = new StringTokenizer(line);}catch (Exception e){throw new RuntimeException();}}return st.nextToken();}
	String nextLine()  {String s=null;try{s=reader.readLine();}catch(IOException e){e.printStackTrace();}return s;}
	int    nextInt()   {return Integer.parseInt(next());}
	long   nextLong()  {return Long.parseLong(next());}
	double nextDouble(){return Double.parseDouble(next());}
	char   nextChar()  {return next().charAt(0);}
	int[]  nextIntArray(int n)         {int[] arr= new int[n];   int i=0;while(i<n){arr[i++]=nextInt();}  return arr;}
	long[] nextLongArray(int n)        {long[]arr= new long[n];  int i=0;while(i<n){arr[i++]=nextLong();} return arr;}
	int[]  nextIntArrayOneBased(int n) {int[] arr= new int[n+1]; int i=1;while(i<=n){arr[i++]=nextInt();} return arr;}
	long[] nextLongArrayOneBased(int n){long[]arr= new long[n+1];int i=1;while(i<=n){arr[i++]=nextLong();}return arr;}
	void   close(){try{reader.close();}catch(IOException e){e.printStackTrace();}}
    }
    
    /********* SOLUTION STARTS HERE ************/
    
    private static void solve(FastScanner in, PrintWriter out){
        int n = in.nextInt();
        int m = in.nextInt();
        int s[] = new int[m];
        int c[] = new int[m];
        int ans[] = new int[n];
        Arrays.fill(ans,-1);
        int f = 0;
        for(int i=0;i<m;i++){
            s[i] = in.nextInt();
            c[i] = in.nextInt();
            if(ans[s[i]-1]!=-1 && ans[s[i]-1]!=c[i]) f=1;
            else ans[s[i]-1] = c[i];
        }
        if(f==1) {out.println(-1);return;}
        if(n==1){
            if(ans[0]==-1) ans[0]=0;
        }else if(n==2){
            if(ans[0]==-1) ans[0]=1;
            else if(ans[0]==0) f=1;
            if(ans[1]==-1) ans[1]=0;
        }else{
            if(ans[0]==-1) ans[0]=1;
            else if(ans[0]==0) f=1;
            if(ans[1]==-1) ans[1]=0;
            if(ans[2]==-1) ans[2]=0;
        }
        if(f==1) {out.println(-1);return;}
        for(int i:ans) out.print(i);
        out.println();
    }
    
    /************* SOLUTION ENDS HERE **********/
}