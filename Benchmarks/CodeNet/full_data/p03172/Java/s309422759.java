import java.util.*;
import java.io.*;

 public class Main{
// taking inputs
static BufferedReader s1;
static BufferedWriter out;
static String read() throws IOException{String line="";while(line.length()==0){line=s1.readLine();continue;}return line;}
static int int_v (String s1){return Integer.parseInt(s1);}
static long long_v(String s1){return Long.parseLong(s1);}
static int[] int_arr() throws IOException{String[] a=read().split(" ");int[] b=new int[a.length];for(int i=0;i<a.length;i++){b[i]=int_v(a[i]);}return b;}
static long[] long_arr() throws IOException{String[] a=read().split(" ");long[] b=new long[a.length];for(int i=0;i<a.length;i++){b[i]=long_v(a[i]);}return b;}
static void assign(){s1=new BufferedReader(new InputStreamReader(System.in));out=new BufferedWriter(new OutputStreamWriter(System.out));}

//......................................@uthor_Alx..............................................

   public static void main(String[] args) throws  IOException{
	        		  assign();
	        		  int[] x=int_arr();
	        		  int n=x[0],k=x[1];
	        		  long[][] prefix=new long[n+1][k+1];
	        		  long mod=(long)1e9+7;
	        		  int[] a=int_arr();
	        		  Arrays.fill(prefix[0],1);
	        		  for(int i=1;i<=n;i++){prefix[i][0]=1;}
	        		  for(int i=1;i<=n;i++){
	        		  	  for(int j=1;j<=k;j++){
	        		  	  	long r=(j-a[i-1]-1>=0)?prefix[i-1][j-a[i-1]-1]:0;
	        		  	  	long l=prefix[i-1][j]; 
	        		  	  	prefix[i][j]=(prefix[i][j-1]+(l-r+mod)%mod)%mod;
	        		  	  }
	        		  }
	        		  long r=(k-a[n-1]-1>=0)?prefix[n-1][k-a[n-1]-1]:0;
	        		  long l=prefix[n-1][k]; 
	        		  out.write((l-r+mod)%mod+"");
                      out.flush();
	        		 
	}
}
	       
	          



	
  



