import java.util.*;
import java.io.*;
public class Main{
/// functions
static long gcd(long a,long b){if(b==0){return a;}return gcd(b,a%b);}
static long Modpow(long a,long p,long m){long res=1;while(p>0){if((p&1)!=0){res=(res*a)%m;}p >>=1;a=(a*a)%m;}return res;}
static long Modmul(long a,long b,long m){return ((a%m)*(b%m))%m;}
static long ModInv(long a,long m){return Modpow(a,m-2,m);}
static long nck(int n,int r,long m){if(r>n){return 0l;}return Modmul(f[n],ModInv(Modmul(f[n-r],f[r],m),m),m);}
// end
static long[] f;
// taking inputs
static BufferedReader s;
static BufferedWriter out;
static String read() throws IOException{String line="";while(line.length()==0){line=s.readLine();continue;}return line;}
static int int_v (String s1){return Integer.parseInt(s1);}
static long long_v(String s1){return Long.parseLong(s1);}
static int[] int_arr() throws IOException{String[] a=read().split(" ");int[] b=new int[a.length];for(int i=0;i<a.length;i++){b[i]=int_v(a[i]);}return b;}
static long[] long_arr() throws IOException{String[] a=read().split(" ");long[] b=new long[a.length];for(int i=0;i<a.length;i++){b[i]=long_v(a[i]);}return b;}
static void assign(){s=new BufferedReader(new InputStreamReader(System.in));out=new BufferedWriter(new OutputStreamWriter(System.out));}
// ends
//......................................@uthor_Alx..............................................

public static void main(String[] args) throws  IOException{
       assign();
       long[] nab=long_arr();
       long mod=(long)1e9+7,res=Modpow(2,nab[0],mod);
       res--;
       long res1=1,res2=1;
      for(int i=1;i<=(int)nab[1];i++){
      	res1=(res1*(nab[0]-nab[1]+i))%mod;
      }
       for(int i=1;i<=(int)nab[1];i++){
      	res2=(res2*i)%mod;
      }
      res-=Modmul(res1,ModInv(res2,mod),mod);
      res=(res+mod)%mod;
      res1=1;res2=1;
      for(int i=1;i<=(int)nab[2];i++){
      	res1=(res1*(nab[0]-nab[2]+i))%mod;
      }
       for(int i=1;i<=(int)nab[2];i++){
      	res2=(res2*i)%mod;
      }
      res-=Modmul(res1,ModInv(res2,mod),mod);
      res=(res+mod)%mod;
             out.write(res+"");
        out.flush();
  }
}
