import java.util.*;

public class Main{
  static int p = 1000000007;
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int Y = sc.nextInt();
    int Z = X+Y;
    if(Z%3 != 0){
      System.out.println(0);
      return;
    }
    
    int d = Z/3;
    int e = (d-Math.abs(X-Y))/2;
    
    long A = 1;
    long B = 1;
    for(int i = 0; i < e; i++){
      A *= d-i;
      A %= p;
      B *= e-i;
      B %= p;
    }
    long ans = A * inv(B, p-2) % p;
    System.out.println(ans);
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
