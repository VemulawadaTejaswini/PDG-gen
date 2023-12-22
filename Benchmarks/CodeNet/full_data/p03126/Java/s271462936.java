import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int data[] = new int[m+1];
    int count = 0;

    for (int i = 0; i < n; i++) {
      int k = sc.nextInt();
      for (int j = 0; j < k; j++) {
        int a = sc.nextInt();
        data[a]++;
      }
    }

    for (int i = 0; i < m+1; i++) {
      if (data[i] == n) {
        count++;
      }
    }

    System.out.println(count);

  }

}
