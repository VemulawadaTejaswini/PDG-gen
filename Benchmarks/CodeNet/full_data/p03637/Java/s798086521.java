import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = Integer.parseInt(sc.next());
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(sc.next());
    }

    int cnt2 = 0;
    int cnt4 = 0;

    for (int i = 0; i < n; i++) {
      if (a[i] % 2 == 0) {
        cnt2++;
        if (a[i] % 4 == 0) {
          cnt4++;
          cnt2--;
        }
      }
    }

    if (cnt4 * 3 + cnt2 >= n && cnt2 != 1) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

    sc.close();
  }

}