import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int x = sc.nextInt();
    int d = 0;
    int ans = 0;

    while(d <= x){
      int l = sc.nextInt();
      d += l;
      ans += 1;
    }

    System.out.println(ans);
  }
}
