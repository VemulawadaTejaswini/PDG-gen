import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int t = 0;
    int x = 0;
    int y = 0;
    
    for (int i=0; i<n; i++){
      int t1 = sc.nextInt();
      int x1 = sc.nextInt();
      int y1 = sc.nextInt();
      int dt = t1 - t;
      int dx = x1 - x;
      int dy = y1 - y;
      int dist = Math.abs(dx) + Math.abs(dy);
      if (dist>dt || (dt-dist)%2==1){
        System.out.println("No");
        return;
      }

      t = t1;
      x = x1;
      y = y1;
    }
    System.out.println("Yes");
  }
}
