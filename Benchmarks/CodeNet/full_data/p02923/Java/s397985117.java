import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = 0;
    int tem = 0;
    int p = -1;
    for(int i = 0; i < n; i++) {
      int h = sc.nextInt();
      if(tem >= h) {
        p++;
        ans = Math.max(ans, p);
      } else { 
        p = 0;
      }
      tem = h;
    }
    System.out.println(ans);
  }
}