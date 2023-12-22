import java.util.*;
import java.io.*;
public class Main{
/// functions
static long gcd(long a,long b){if(b==0){return a;}return gcd(b,a%b);}
static long Modpow(long a,long p,long m){if(p==1){return a;}long x=Modpow(a,p/2,m);x=(x*x)%m;return (p&1l)!=0? (x*a)%m:x;}
static long Modmul(long a,long b,long m){return ((a%m)*(b%m))%m;}
static long ModInv(long a,long m){return Modpow(a,m-2,m);}
static long nck(int n,int r,long m){if(r>n){return 0l;}return Modmul(f[n],ModInv(Modmul(f[n-r],f[r],m),m),m);}
// end
static long[] f;
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
       long mod=(long)1e9+7;
       int n=2000008;
       f=new long[n];f[0]=1;
       for(int i=1;i<n;i++){f[i]=(f[i-1]*i)%mod;}
       	//nck(c2+r2+2,r2+1)+nck(c1+r1,r1)-nck(c2+r1+1,r1)-nck(c1+r2+1,r2+1)
       	long res=nck(a[2]+a[3]+2,a[3]+1,mod)+nck(a[1]+a[0],a[1],mod)-nck(1+a[3]+a[0],a[0],mod)-nck(1+a[1]+a[2],a[2]+1,mod);
        out.write(res%mod+"");
        out.flush();
  }
}
