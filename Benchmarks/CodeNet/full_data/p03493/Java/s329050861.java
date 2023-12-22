import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    int ans = 0;
    for (int i = 2; i >= 0; i--){
      ans += s/Math.pow(10, i);
    }
    System.out.println(ans);
  }
}
