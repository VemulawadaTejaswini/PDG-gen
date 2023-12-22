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
	        		  //int n=int_v(read());
	        		 char[] c=read().toCharArray();
	        		 int[] r=new int[200005];
	        		 r[0]=1; int j=1;
	        		 for(int i=1;i<200005;i++){
	        		 	j=(j*10)%2019;
	        		 	r[i]=j; 
	        		 }
	        		 int n=c.length; j=0;
	        		 long res=0;
	        		 Map<Integer,Integer> map=new HashMap<>();
	        		 map.put(0,1);
	        		 for(int i=0;i<n;i++){
	        		 	int k=r[n-i-1];
	        		 	j+=(k*(c[i]-'0'));
	        		 	j=j%2019;
	        		 	res+=map.getOrDefault(j,0);
	        		 	//if(map.getOrDefault(j,0)>0){out.write(i+" ");}
	        		 	map.put(j,map.getOrDefault(j,0)+1);
	        		 }
	        		 out.write(res+"");
                      out.flush();
	        		 
	}
}
	       
	          



	
  



