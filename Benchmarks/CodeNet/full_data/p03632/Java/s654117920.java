import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int D = sc.nextInt();
    int cnt = 0;
    for (int i = A; i <= B; i++) {
      if (i > C && i <= D) {
        cnt++;
      }
    }
    System.out.println(cnt);
  }
}
