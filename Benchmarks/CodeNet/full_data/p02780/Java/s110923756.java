import java.util.*;
import java.io.*;
public class Main{
// taking inputs
static BufferedReader s;
static String read() throws IOException{String line="";while(line.length()==0){line=s.readLine();continue;}return line;}
static int int_v (String s1){return Integer.parseInt(s1);}
static long long_v(String s1){return Long.parseLong(s1);}
static int[] int_arr() throws IOException{String[] a=read().split(" ");int[] b=new int[a.length];for(int i=0;i<a.length;i++){b[i]=int_v(a[i]);}return b;}
static long[] long_arr() throws IOException{String[] a=read().split(" ");long[] b=new long[a.length];for(int i=0;i<a.length;i++){b[i]=long_v(a[i]);}return b;}
// ends
static int value(String s1){return Integer.parseInt(s1);}

public static void main(String[] args) throws  IOException{
        s=new BufferedReader(new InputStreamReader(System.in));;
       StringBuilder sb=new StringBuilder();
       BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
       int[] a=int_arr();
       int[] p=int_arr();
       long sum=0,tmp=0;
       for(int i=0;i<a[1];i++){sum+=p[i];}tmp=sum;
       	for(int i=a[1];i<a[0];i++){
       		tmp+=p[i]-p[i-a[1]];
       		sum=Math.max(sum,tmp);
       	}
       	double xx=(double)(sum+a[1])/2;
        out.write(xx+"");
        out.flush();
  }
}
