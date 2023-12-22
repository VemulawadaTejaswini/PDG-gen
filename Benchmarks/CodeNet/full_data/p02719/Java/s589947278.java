import java.util.*;
public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    
    long n = sc.nextLong();
    long k = sc.nextLong();
    
    long min = 0;
    
    if (n > k){
      long a = n%k;
      if (a > 0){
        min = Math.abs(a-k);
      }
    } else if (n < k){
      long a = k-n;
      if (n < a){
        min = n;
      } else {
        min = a;
      }
    }
    
    System.out.println(min);
  }
}