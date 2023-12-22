import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double n = sc.nextInt();
    double sum = 0;
    double count = 0;
    for (int i = 1; i <= n; i++) {
      if (i % 2 != 0) {
        count++;
      }
    }
    System.out.println(String.format("%.10f", count / n));
  }
}
