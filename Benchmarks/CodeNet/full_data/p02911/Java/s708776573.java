import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int k = sc.nextInt();
    int q = sc.nextInt();

    int[] ary = new int[n + 1];
    Arrays.fill(ary,0);

    for (int i = 0; i < q; ++i) {
      int index = sc.nextInt();
      ++ary[index];
    }

    for (int i = 1; i <= n; ++i) {
      if (k - q + ary[i] > 0) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }

    sc.close(); 
  }
}
