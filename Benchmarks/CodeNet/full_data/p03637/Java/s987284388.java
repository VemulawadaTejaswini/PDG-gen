import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = Integer.parseInt(sc.next());
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(sc.next());
    }

    int cnt1 = 0;

    int cnt4 = 0;

    for (int i = 0; i < n; i++) {
      if (a[i] % 4 == 0) {
        cnt4++;
      } else {
        if (a[i] % 2 != 0) {
          cnt1++;
        }
      }
    }

    if (cnt4 >= cnt1) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

    sc.close();
  }

}