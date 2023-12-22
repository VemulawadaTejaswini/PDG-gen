import java.util.*;
public class Main{
  public static long p = 1_000_000_007;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    if((2*y-x)%3!=0||(2*x-y)%3!=0||Math.max(x,y)>Math.min(x,y)*2){
      System.out.println(0);
      return;
    }
    int s = (2*y-x)/3;
    int t = (2*x-y)/3;
    long z = (long)s+t;
    long A = 1;
    long B = 1;
    for(int i=0;i<s;i++){
      A*=(z-i);
      A=A%p;
      B*=(s-i);
      B=B%p;
    }
    System.out.println(A*inv(B,p-2)%p);
  }
  public static long inv(long n, long k){
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