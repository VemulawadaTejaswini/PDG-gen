import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int sum = 0;
    int[] x = new int[n];
    for(int i = 0; i < n; i++) {
      x[i] = Integer.parseInt(sc.next());
    }
    for(int i = 0; i < n - 1; i++) {
      for(int j = i + 1; j < n; j++) {
        sum += x[i] * x[j];
      }
    }
    System.out.println(sum);
  }
}
