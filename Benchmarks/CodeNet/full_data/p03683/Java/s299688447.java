
import java.math.BigInteger;
import java.util.*;
public class Main{



public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  fact=new long[100001];
  fact[0]=1;
  for(int i=1;i<100001;i++) {
    fact[i]=(fact[i-1]%mod*i%mod+mod)%mod;
  }
 int n=sc.nextInt();
 int m=sc.nextInt();
 if((n==1&&m>1)||(m==1&&n>1)) {
   System.out.println(0);
 }else {
 if((n%2==0&&m%2==0)||(n%2!=0&&m%2!=0))
 System.out.println((fact[n]%mod*fact[m]%mod*2%mod+mod)%mod);
 else
   System.out.println((fact[n]%mod*fact[m]%mod+mod)%mod);
 }
}


   
static long modInverse(long fac, int p) 
{ 
    return pow(fac, p - 2); 
} 


static long nCr(int n, int r, 
                         int p) 
{ 

  
    if (r == 0) 
        return 1; 


    long [] fac = new long [n + 1]; 
    fac[0] = 1; 

    for (int i = 1; i <= n; i++) 
        fac[i] = fac[i - 1] * i % p; 

    return (fac[n] * modInverse(fac[r], p) 
            % p * modInverse(fac[n - r], p) 
            % p) 
        % p; 
} 


public static long[] fact;
public static long[] invfact;
public static long ncr(int n, int r){
  if(r > n) return 0;
  return ((((fact[n]) * (invfact[r])) % mod)* invfact[n-r]) % mod;
}
static int mod=(int)1e9+7;
static long pow(long x,long y) {
 long res=1l;
 while(y!=0) {
   if(y%2==1) {
     res=x*res%mod;
   }
   y/=2;
   x=x*x%mod;
 }
 return res;
}


}
 






