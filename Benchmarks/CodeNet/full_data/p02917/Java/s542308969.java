import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    long[] b = new long[n - 1];
    for (int i = 0; i < n - 1; i++) {
      b[i] = sc.nextInt();
    }

    long sum = b[0];
    for (int i = 1; i < b.length; i++) {
      sum += Math.min(b[i - 1], b[i]);
    }
    System.out.println(sum + b[b.length - 1]);
  }
}
