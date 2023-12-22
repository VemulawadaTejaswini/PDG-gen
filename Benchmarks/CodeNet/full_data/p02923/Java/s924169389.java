import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int res = 0;
    int tmp = 0;
    int prev = 0;
    for (int i = 0; i < N; i++) {
      int now = scan.nextInt();
      if (prev >= now) {
        res = Math.max(res, tmp);
      } else {
        tmp++;          
      }
 
      prev = now;

    }
    scan.close();
 
    System.out.println(res);
  }
}