import java.util.*;

 
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long k = sc.nextLong();
    
    n = n % k;
    
    if(n == 0){
      System.out.println(0);
      return;
    }
    
    long ans = Math.min(k-n,n);
    System.out.println(ans);
    
  }
}