import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int result = 0;
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = scan.nextInt();
    }
    int correct = 0;
    int cmp = 1;
    for (int i = 0; i < n; i++) {
      if (a[i] != cmp) {
        result++;
      }

      if (a[i] == cmp) {
        cmp++;
        correct++;
      }
    }

    if (correct == 0) {
      System.out.println("-1");
    } else {
      System.out.println(String.valueOf(result));
    }
  }
}
