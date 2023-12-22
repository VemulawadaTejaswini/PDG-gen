import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int p = sc.nextInt();
    int ans = 0;
    for (int i = 1; i <= p; i++) {
      if (p % Math.pow(i, n) == 0) {
        ans = i;
      }
    }
    System.out.println(ans);
  }

}
