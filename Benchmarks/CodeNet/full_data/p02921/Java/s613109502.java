import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int ans = 0;
    int tap = 1;

    while(tap<b){
      tap += a-1;
      ans++;
    }
    System.out.println(ans);
  }
}
