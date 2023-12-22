import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int d = sc.nextInt() + 1;
    int ans = 0;

    while (d <= n) {
      ans++;
      d *= 2;
    }

    System.out.println(ans);

  }
}