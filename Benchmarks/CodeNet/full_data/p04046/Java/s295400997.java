import java.util.Scanner;

class Main{
  static long[] factorialArray;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long h = Integer.parseInt(sc.next());
    long w = Integer.parseInt(sc.next());
    long a = Integer.parseInt(sc.next());
    long b = Integer.parseInt(sc.next());
    long mod = 1000000007l;
    
    factorialArray = new long[(int)(h+w)];
    factorialArray[0] = 1l;
    for(long i=1l; i<h+w; i++){
      factorialArray[(int)i] = i%mod*factorialArray[(int)i-1]%mod;
    }
    long total = 0l;
    for(long i=b; i<w; i++){
      total += comb(i+h-a-1l, i, mod)*comb(-i+w-2l+a, a-1l, mod)%mod;
      total %= mod;
    }
    System.out.println(total);
  }
  
  private static long power(long n, long pow, long mod){
    if(pow == 0l){
      return 1l;
    }else if(pow == 1l){
      return n;
    }else{
      long x = power(n, pow/2l, mod);
      if(pow%2l == 0l){
        return x*x%mod;
      }else{
        return x*x%mod*n%mod;
      }
    }
  }
  
  private static long comb(long n, long k, long mod){
    return factorialArray[(int)n]*power(factorialArray[(int)k], mod-2l, mod)%mod*power(factorialArray[(int)(n-k)], mod-2l, mod)%mod;
  }
}
