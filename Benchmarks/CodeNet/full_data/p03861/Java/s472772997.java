import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long x = sc.nextLong();

    long ans = b/x + 1;
    if(l != 0){
      ans += a/x + 1;
    }

    System.out.println(ans);

  }
}