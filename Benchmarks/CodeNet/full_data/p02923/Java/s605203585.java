import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int pre = 0;
    int max = 0;
    int cnt = 0;
    for (int i = 0; i < n; i++) {
      int h = sc.nextInt();
      if (pre >= h) {
        cnt++;
      } else {
        cnt = 0;
      }
      max = Math.max(max, cnt);
      pre = h;
    }

    System.out.println(max);

  }
}