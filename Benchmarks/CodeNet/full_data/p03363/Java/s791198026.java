import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int[] data = new int[n+1];
    data[0] = 0;
    int count = 0;

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    for (int i = 1; i < n+1; i++) {
      data[i] = data[i-1] + a[i-1];
    }

    for (int i = 0; i < n; i++) {
      for (int j = i+2; j < n+1; j++) {
        if (data[j] - data[i] == 0) {
          count++;
        }
      }
    }

    System.out.println(count);

  }

}
