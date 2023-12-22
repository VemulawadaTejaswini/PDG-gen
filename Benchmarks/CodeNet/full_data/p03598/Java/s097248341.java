import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int sum = 0;
    for (int i = 0; i < n; i++) {
      int x = sc.nextInt();
      sum += 2 * Math.min(Math.abs(x), Math.abs(x - k));
    }

    System.out.println(sum);

  }
}