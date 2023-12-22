import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main{
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      long a = sc.nextLong();
      long b = sc.nextLong();
    
      long gcd = gcd(a,b);
      Set<Integer> set = new HashSet<Integer>();      
      for(int i = 2; i <= gcd; i++){
       while(gcd % i == 0){
         gcd /= i;
         set.add(i);
       }
     }

	System.out.println(set.size()+1);
  }

  static long gcd(long a, long b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }
}