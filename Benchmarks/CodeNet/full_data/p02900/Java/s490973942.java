import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main{
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      long a = sc.nextLong();
      long b = sc.nextLong();
    
      long gcd = gcd(a,b);
      Set<Long> set = new HashSet<Long>();
      set.add(1L);
      for(long i = 2; i*i <= gcd; i++){
       while(gcd % i == 0){
         gcd /= i;
         set.add(i);
       }
     }
     if(gcd > 1) System.out.println(set.size()+1);
     else System.out.println(set.size());
  }

  static long gcd(long a, long b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }
}