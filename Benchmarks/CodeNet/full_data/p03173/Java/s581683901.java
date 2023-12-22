import java.util.*;
import java.io.*;
import java.math.BigInteger; 

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

static long rec(long[][] dp, int i, int j,long[] pre){
	if(i>=j){return 0;}
	if(dp[i][j]!=0){return dp[i][j];}
	long res=pre[j]-pre[i-1],tmp=Long.MAX_VALUE;
	for(int k=i;k<j;k++){
		tmp=Math.min(tmp,rec(dp,i,k,pre)+rec(dp,k+1,j,pre));
	}
	 dp[i][j]=(res+tmp);
	 return dp[i][j];
}
   public static void main(String[] args) throws  IOException{
	        		  assign();
	        		  int n=int_v(read());
	        		  int[] a=int_arr();
	        		  long[] pre=new long[n+1];
	        		  for(int i=1;i<=n;i++){pre[i]=a[i-1]+pre[i-1];}
	        		  long[][] dp=new long[n+1][n+1];
	        		  out.write(rec(dp,1,n,pre)+"");
                      out.flush();
	        		 
	}
}
	       
	          



	
  



