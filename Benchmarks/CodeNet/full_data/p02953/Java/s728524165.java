import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] h = new int[n];

    for (int i = 0; i < n; i++) {
      h[i] = sc.nextInt();
    }

    for (int i = 0; i < (n - 1); i++) {
      if ((h[i + 1] - h[i]) < 0) {
        System.out.println("No");
        return;
      } else if (h[i + 1] > h[i]) {
        h[i + 1]--;
      }
    }

    System.out.println("Yes");

  }
}