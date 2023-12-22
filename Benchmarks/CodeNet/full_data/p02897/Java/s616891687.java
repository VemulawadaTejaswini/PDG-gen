import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int a = (n / 2) + (n % 2 == 1 ? 1 : 0);
    double b = (double)a / (double)n;
    System.out.println(String.format("%.10f", b));
  }
}