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
 static long mergeSort(int[] arr, int i1,int j1){
 	if(i1==j1&&arr[i1]==arr[j1]){return 1;}
        if(i1>=j1){return 0;}
        int m=(i1+j1)/2;
        long x=mergeSort(arr,i1,m)+mergeSort(arr,m+1,j1);
        int[] l=new int[m-i1+1];
        int[] r=new int[j1-m];
        for(int i=i1;i<=m;i++){l[i-i1]=arr[i];}
        for(int i=m+1;i<=j1;i++){r[i-(m+1)]=arr[i];}
        int i=0,j=0,k=i1;
        while(i<m-i1+1&&j<j1-m){
            if(l[i]>=r[j]){arr[k]=r[j];x++;j++;k++;}
            else {arr[k]=l[i];i++;k++;}
        }
        while(i<m-i1+1){arr[k]=l[i];i++;k++;}
        while(j<j1-m){arr[k]=r[j];j++;k++;}
        return x;
    }
public static void main(String[] args) throws FileNotFoundException, IOException{
       Scanner s=new Scanner(System.in);
       BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
       int n=s.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<n;i++){arr[i]=s.nextInt();}
       	int[] dp=new int[n+1];dp[0]=10000000;
       int res=0;
       for(int i=1;i<=n;i++){
       	dp[i]=Math.min(dp[i-1],arr[i-1]);
       	if(arr[i-1]<=dp[i]){res++;}
       }
       out.write(res+"");
        out.flush();
  }
}
