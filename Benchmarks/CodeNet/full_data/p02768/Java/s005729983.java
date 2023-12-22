import java.util.*;

public class Main{
  static int p = 1000000007;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();

    long ans = 0;
    long n = inv(2, N);
    if(n != 0) n -= 1;
    long c = 1;
    long n1 = 1;
    for(int i = 0; i < a; i++){
      n1 *= N-i;
      n1 %= p;
      c *= a-i;
      c %= p;
    }
    
    long d = 1;
    long n2 = 1;
    for(int i = 0; i < b; i++){
      n2 *= N-i;
      n2 %= p;
      d *= b-i;
      d %= p;
    }
    
    
    n -= (n1 * inv(c,p-2) % p);
    n -= (n2 * inv(d,p-2) % p);
    while(n < 0){
      n += p;
    }
    System.out.println(n);
  }
  
  public static long inv(long n, int k){
    if(k == 0){
      return 1;
    }
    
    if(k%2 == 0){
      long l = inv(n, k/2);
      return l * l % p;
    }else{
      return n * inv(n, k-1) % p;
    }
  }
}