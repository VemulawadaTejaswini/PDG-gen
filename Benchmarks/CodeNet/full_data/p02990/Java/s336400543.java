import java.util.*;
public class Main{
  static class NCK{
    int max;
    int mod;
    long[] fac;
    long[] finv;
    long[] inv;
    NCK(){
      this(510000,1000000007);
    }
    NCK(int max,int mod){
      this.max=max;
      this.mod=mod;
      pre(max,mod);
    }
    void pre(int nmax,int nmod){
      fac = new long[nmax];
      finv = new long[nmax];
      inv = new long[nmax];
      fac[0]=fac[1]=1;
      finv[0]=finv[1]=1;
      inv[1]=1;
      for(int i=2;i<nmax;i++){
        fac[i]=fac[i-1]*i%nmod;
        inv[i]=nmod-inv[nmod%i]*(nmod/i)%nmod;
        finv[i]=finv[i-1]*inv[i]%nmod;
      }
    }
    long nCk(int n,int k){
      if(n<k){return 0;}
      if(n<0||k<0){return 0;}
      return fac[n]*(finv[k]*finv[n-k]%mod)%mod;
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int mod=1_000_000_007;
    NCK nck=new NCK(n+3,mod);
    for(int i=1;i<=k;i++){
      long ans=nck.nCk(n-k+1,i)*nck.nCk(k-1,i-1);
      System.out.println(ans%mod);
    }
  }
}

