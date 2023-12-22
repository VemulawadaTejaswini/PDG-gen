import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int[] list = new int[n];
    for (int i = 0; i < n; i++) {
      list[i] = sc.nextInt();
    }

    int count = 0;
    for (int i = 0; i < n - 2; i++) {
      int a = list[i];
      int b = list[i+1];
      int c = list[i+2];

      if((b > a && b < c) || (b < a && b > c)) {
        count++;
      }
    }

    System.out.println(count);
  }
}