import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String ans = "No";
    for(int i = 0; i <= n; i++) {
      int d = n - (4 * i);
      if((d >= 0) && ((d % 7) == 0)) ans = "Yes";
    }
    System.out.println(ans);
  }
}