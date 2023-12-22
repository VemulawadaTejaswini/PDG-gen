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
        int n = 3, m = 0;
        int mat[][] = new int[n][n];
        int mat2[][] = new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                mat[i][j] = in.nextInt();
        n = in.nextInt();
        for(int i=0;i<n;i++){
            m = in.nextInt();
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    if(mat[j][k]==m) mat2[j][k]=1;
                }
            }
        }
        int cnt=0;
        boolean bingo = false;
        for(int i=0;i<3;i++){
            cnt=0;
            for(int j=0;j<3;j++){
                if(mat2[i][j]==1) cnt++;
            }
            if(cnt==3) bingo = true;
        }
        for(int i=0;i<3;i++){
            cnt=0;
            for(int j=0;j<3;j++){
                if(mat2[j][i]==1) cnt++;
            }
            if(cnt==3) bingo = true;
        }
        cnt=0;n=3;
        for(int i=0;i<n;i++) if(mat2[i][i]==1) cnt++;
        if(cnt==3) bingo = true;
        cnt=0;
        for(int i=0;i<n;i++) if(mat2[i][n-i-1]==1) cnt++;
        if(cnt==3) bingo = true;
        out.println(bingo?"Yes":"No");
    }
    
    /************* SOLUTION ENDS HERE **********/
}