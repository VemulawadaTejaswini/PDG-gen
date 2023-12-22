import java.util.*;
import java.io.*;
  public class Main {
     
static BufferedReader s1;
static BufferedWriter out;
static String read() throws IOException{String line="";while(line.length()==0){line=s1.readLine();continue;}return line;}
static int int_v (String s1){return Integer.parseInt(s1);}
static long long_v(String s1){return Long.parseLong(s1);}
static int[] int_arr() throws IOException{String[] a=read().split(" ");int[] b=new int[a.length];for(int i=0;i<a.length;i++){b[i]=int_v(a[i]);}return b;}
static long[] long_arr() throws IOException{String[] a=read().split(" ");long[] b=new long[a.length];for(int i=0;i<a.length;i++){b[i]=long_v(a[i]);}return b;}
static void assign(){s1=new BufferedReader(new InputStreamReader(System.in));out=new BufferedWriter(new OutputStreamWriter(System.out));}

  public static void main(String args[]) throws  IOException {
        assign();
        int t=1;//int_v(read());
        while(t--!=0){
            int[] n1=int_arr();
            int n=n1[0],k=n1[1];
            long[] pre=new long[n+1];
            long s=0,mod=(long)1e9+7,res=0;
            for(int i=1;i<=n;i++){s+=i;pre[i]=pre[i-1]+i;}
            for(int i=k;i<=n;i++){
                long min=pre[i-1],max=s-pre[n-i];
                res+=max-min+1;
            }
            out.write(((res+1)%mod)+"\n"); //0 1 2 3 ,5+4

        }
             out.flush();
    }
           
}
