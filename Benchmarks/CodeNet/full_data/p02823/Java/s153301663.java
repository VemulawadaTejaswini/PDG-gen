import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long a = sc.nextLong();
    long b = sc.nextLong();
    
    long ans = 0;
    if((b-a)%2 == 0){
      ans = (b-a)/2;
    }else{
      ans = Math.max(Math.min(a-1, N-a), Math.min(b-1, N-b));
    }
    System.out.println(ans);
  }
}