import java.util.*;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int range = sc.nextInt() * 2 + 1;
    int cnt = 0;
    while (true) {
      cnt++;
      N -= range;
      if (N <= 0) {
        break;
      }
    }
    System.out.println(cnt);
  }
}
