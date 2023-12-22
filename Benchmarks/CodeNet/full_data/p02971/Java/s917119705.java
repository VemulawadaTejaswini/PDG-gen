import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int first = 0;
    int second = 0;
    int maxindex = 0;

    for (int i = 0; i < n; i++) {
      int a = sc.nextInt();
      int ftmp = first;
      first = Math.max(ftmp, a);
      if (first > ftmp) {
        maxindex = i;
      }
      second = med(ftmp, second, a);
    }

    for (int i = 0; i < n; i++) {
      if (i == maxindex) {
        System.out.println(second);
      } else {
        System.out.println(first);
      }
    }

  }

  // 3数の中央値を求めるメソッド
  static int med(int a, int b, int c) {
    if (a >= b) {
      if (b >= c) {
        return b;
      } else if (a <= c) {
        return a;
      } else {
        return c;
      }
    } else if (a > c) {
      return a;
    } else if (b > c) {
      return c;
    } else {
      return b;
    }
  }

}