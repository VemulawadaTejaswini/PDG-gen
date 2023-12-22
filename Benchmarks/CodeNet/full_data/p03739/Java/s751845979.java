import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    int count = 0;
    int sum = a[0];
    if (sum > 0) {
      for (int i = 1; i < n; i++) {
        sum += a[i];
        if (i % 2 != 0)  {
          while (sum >= 0) {
            sum--;
            count++;
          }
        } else {
          while (sum <= 0) {
            sum++;
            count++;
          }
        }
      }
    } else {
      for (int i = 1; i < n; i++) {
        sum += a[i];
        if (i % 2 != 0)  {
          while (sum <= 0) {
            sum++;
            count++;
          }
        } else {
          while (sum >= 0) {
            sum--;
            count++;
          }
        }
      }
    }
    System.out.println(count);
  }
}