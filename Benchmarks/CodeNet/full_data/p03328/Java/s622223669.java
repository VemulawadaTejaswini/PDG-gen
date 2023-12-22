import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    System.out.println(sovle(a, b));
  }

  private static long sovle(int a, int b) {
    int res1 = 0;
    int res2 = 0;
    int count1 = 1;
    int count2 = 1;
    for (; true; count1++) {
      res1 += count1;
      if (res1 > a) {
        break;
      }
    }
    for (; true; count2++) {
      res2 += count2;
      if (res2 > b) {
        break;
      }
    }
    while (res1 - a != res2 - b) {
      if (res1 - a < res2 - b) {
        while (res1 - a < res2 - b) {
          res1 += count1;
          count1++;
        }
      } else if (res1 - a > res2 - b) {
        while (res1 - a > res2 - b) {
          res2 += count2;
          count2++;
        }
      } else {
        return res1 - a < 1 ? 1 : res1 - a;
      }
    }
    return res1 - a < 1 ? 1 : res1 - a;
  }

}