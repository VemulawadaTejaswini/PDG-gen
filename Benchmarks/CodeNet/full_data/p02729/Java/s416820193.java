import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sn = new Scanner(System.in);

    int n = sn.nextInt();
    int m = sn.nextInt();
    
    int cnt = 0;
    
    if (n > 1) {
      for (int i = 1; i < n; i ++) {
        cnt = cnt + (n - i);
      }
    }
    
    if (m > 1) {
      for (int i = 1; i < m; i ++) {
        cnt = cnt + (m - i);
      }
    }
    
    System.out.print(cnt);
  }
}