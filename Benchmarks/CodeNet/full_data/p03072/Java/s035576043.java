import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] h = new int[n];
    for (int i = 0; i < n; i++) {
      h[i] = sc.nextInt();
    }

    int min = 0;
    int count = 1;

    for (int i = 1; i < n; i++) {
      if (h[min] <= h[i]) {
        min = i;
        count++;
      }
    }
    System.out.println(count);
  }

}
