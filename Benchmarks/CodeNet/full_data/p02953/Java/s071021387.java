import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc136/tasks/abc136_c
 */
public class Main {

  private static void answer(long[] hs) {
    if (hs.length == 1) {
      System.out.println("YES");
      return;
    }

    long max = hs[0];
    long maxi = 0;
    long min = hs[0];
    long mini = 0;
    for (int i = 1; i < hs.length; i++) {
       if (max <= hs[i]) {
         max = hs[i];
         maxi = i;
       }

       if (min >= hs[i]) {
         min = hs[i];
         mini = i;
       }

       if (mini > maxi && max - min > 1) {
         System.out.println("NO");
         return;
       }
    }

    System.out.println("YES");
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    long[] hs = new long[n];
    for (int i = 0; i < n; i++) {
      hs[i] = scan.nextLong();
    }
    scan.close();

    answer(hs);
  }
}
