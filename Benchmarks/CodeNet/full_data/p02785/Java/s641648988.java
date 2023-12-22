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
static long help(long k){
	if(k<=1){return 1;}
	long x=help(k/2);
	return 2*x+1;
}
public static void main(String[] args) throws FileNotFoundException, IOException{
       Scanner s=new Scanner(System.in);
       StringBuilder sb=new StringBuilder();
       BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
       int n=s.nextInt(),k=s.nextInt();
        int[] arr=new int[n+1];
        for(int i=1;i<=n;i++){arr[i]=s.nextInt();}
        	Arrays.sort(arr);
        long res=0;
        for(int i=1;i<=Math.max(n-k,0);i++){
        	res+=arr[i];
        }
       out.write(res+"");
        out.flush();
  }
}
