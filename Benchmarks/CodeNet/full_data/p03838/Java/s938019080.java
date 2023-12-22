// x < y
//   x < 0 && y < 0 || x > 0 && y > 0 : y-x
//   x < 0 && y > 0
//      |x| < |y| : y+x+1
//      |y| < |x| : -y-x+1
// y < x
//   y < 0 && x < 0 : +2
//   y > 0 && x > 0 : +2
//   y < 0 && x > 0
//      |x| < |y| : +1
//      |y| < |x| : +1

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int A = Math.abs(Math.abs(x)-Math.abs(y));
    int B = 0;
    if (x == 0 || y == 0) {
      B = 0;
    } else if (x < y) {
      B = (long)x*y > 0 ? 0 : 1;
    } else if (y < x) {
      if ((long)x*y > 0) {
        B = A == 0 ? 0 : 2;
      } else {
        B = 1;
      }
    }
    System.out.println(A+B);
  }
}