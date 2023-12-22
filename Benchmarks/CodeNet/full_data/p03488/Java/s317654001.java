import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      int x = sc.nextInt();
      int y = sc.nextInt();
      int dist = x + y;

      int tCnt = 0, fCnt = 0;
      for(char c : s.toCharArray()) {
          if(c == 'F') fCnt++;
          else tCnt++;
      }
      if(fCnt < dist) {
        System.out.println("No");
        return;
      }
      
      if(x > 0 && y > 0 || x > 0 && y < 0) {
        if(fCnt == dist) {
          if(tCnt >= 1) System.out.println("Yes");
          else System.out.println("No");
        } else {
          int diff = fCnt - dist;
          if(diff % 2 == 0 && tCnt >= 2) System.out.println("Yes");
          else System.out.println("No");
        }
      } else if(x == 0 || y == 0 || x < 0 && y > 0 || x < 0 && y < 0) {
        if(fCnt == dist) {
          if(tCnt >= 2) System.out.println("Yes");
          else System.out.println("No");
        } else {
          int diff = fCnt - dist;
          if(diff % 2 == 0 && tCnt >= 2) System.out.println("Yes");
          else System.out.println("No");
        }
      }
      
  }

}