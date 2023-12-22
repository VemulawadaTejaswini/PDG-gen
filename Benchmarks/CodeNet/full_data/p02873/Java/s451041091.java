import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int minH = 0;
    int h = 0;
    long sum = 0;
    for (int i = 0; i < S.length(); i++) {
      if (S.charAt(i) == '<') {
        h++;
        sum += h;
      } else {
        h--;
        sum += h;
        minH = Math.min(minH, h);
      }
    }
    System.out.println(sum-(long)minH*(S.length()+1));
  }
}