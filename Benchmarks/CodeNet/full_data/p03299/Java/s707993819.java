import java.util.Scanner;
class Main{
  
  static int[] h;
  static long mod = 1000000007;
  
  static long pow(long a, long p, long mod){
    long res = 1;
    for(int i=0;i<64;++i){
      if(((p>>i)&1)==1)res=(res*a)%mod;
      a = (a*a)%mod;
    }
    return res;
  }
  
  static long culc(int l, int r){
    if(r-l <1)return 1;
    int minIndex=l;
    for(int i=l+1;i<r;++i)if(h[i]<h[minIndex])minIndex=i;
    long dp1 = pow(2, h[minIndex], mod)-2;
    long dp2 = 2;
    for(int i=minIndex+1;i<r;++i){
      dp2 = (dp2*2)%mod;
      long dh = Math.max(0, h[i]-h[i-1]);
      dp1 = ((dp1 * pow(2, dh, mod))%mod + (dp2 * (pow(2, dh, mod)-1+mod)%mod)%mod)%mod;
    }
    for(int i=minIndex-1;i>=l;--i){
      dp2 = (dp2*2)%mod;
      long dh = Math.max(0, h[i]-h[i+1]);
      dp1 = ((dp1 * pow(2, dh, mod))%mod + (dp2 * (pow(2, dh, mod)-1+mod)%mod)%mod)%mod;
    }
    return (dp1+dp2)%mod;
  }
  
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    h = new int[n+1];h[n]=1;
    for(int i=0;i<n;++i)h[i]=scan.nextInt();
    long totu = -1;
    if(n>1 && h[0]>h[1]){
      totu += h[0]-h[1];h[0]=h[1];
    }
    if(n>1 && h[n-1]>h[n-2]){
      totu += h[n-1]-h[n-2];h[n-2]=h[n-1];
    }
    for(int i=1;i<n-1;++i){
      if(h[i]>h[i-1] && h[i]>h[i+1]){
        totu += h[i] - Math.max(h[i-1], h[i+1]);
        h[i] = Math.max(h[i-1], h[i+1]);
      }
    }
    int l=0;
    long ans = 1;
    for(int i=0;i<n+1;++i){
      if(h[i]==1){
        totu+=1;
        ans = (ans * culc(l,i))%mod;
    	l=i+1;
      }
    }
    ans = (ans * pow(2, totu, mod))%mod;
    System.out.println(ans);
  }
}