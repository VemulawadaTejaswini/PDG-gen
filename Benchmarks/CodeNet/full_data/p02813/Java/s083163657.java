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
    static int a[][],pt=0;
    private static int fact(int n){
        int ans=1;
        for(int i=2;i<=n;i++) ans*=i;
        return ans;
    }
    private static void solve(FastScanner in, PrintWriter out){
        int n = in.nextInt();
        int P[] = new int[n];
        int Q[] = new int[n];
        int per[] = new int[n];
        for(int i=0;i<n;i++) P[i] = in.nextInt();
        for(int i=0;i<n;i++) Q[i] = in.nextInt();
        for(int i=0;i<n;i++) per[i] = i+1;
        a = new int[fact(n)][n];
        perm(per,0,n);
        Arrays.sort(a, new Comparator<int[]>(){
            public int compare(int a[],int b[]){
                for(int i=0;i<a.length;i++){
                    if(a[i]!=b[i]) return a[i]-b[i];
                }
                return 0;
            }
        });
        // out.println("Display Lexicographically Sorted Permutations: ");
        // for(int i=0;i<fact(n);i++){
        //     for(int j=0;j<n;j++){
        //         out.print(a[i][j]+" ");
        //     }out.println();
        // }
        int t1 = countKthPerm(P,n);
        int t2 = countKthPerm(Q,n);
        out.println(Math.abs(t1-t2));
    }
    private static int countKthPerm(int arr[],int n){
        for(int i=0;i<fact(n);i++){
            boolean ok = true;
            for(int j=0;j<n;j++){
                if(arr[j]!=a[i][j]) ok = false;
            }
            if(ok) return i;
        }
        return 0;
    }
    private static void perm(int per[],int i,int n){
        if(i==n){
            for(int k=0;k<n;k++){
                a[pt][k] = per[k];
            }
            ++pt;
        }else{
            for(int j=i;j<n;j++){
                swap(per,j,i);
                perm(per,i+1,n);
                swap(per,j,i);
            }
        }
    }
    private static void swap(int per[],int i,int j){
        int tmp = per[i];
        per[i] = per[j];
        per[j] = tmp;
    }
    
    
    /************* SOLUTION ENDS HERE **********/
}