import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] d1 = new int[n];
    int[] d2 = new int[n];

    for (int i = 0; i < n; i++) {
      d1[i] = sc.nextInt();
      d2[i] = d1[i];
    }

    Arrays.sort(d2);
    int x = d2[n / 2 - 1];
    int y = d2[n / 2];

    System.out.println(d2[n / 2] - d2[n / 2 - 1]);
  }
}
