import java.beans.Introspector;
import java.util.*;
final class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    long n = s.nextLong();
    long a = s.nextLong();
    long b = s.nextLong();
    
    if((b-a)%2==0)
        System.out.println(((b-a)/2));
    else{
       // long ans = Math.min(n-a, b-1);
        System.out.println(((b-a)/2)+2);
    }
    
  }
}