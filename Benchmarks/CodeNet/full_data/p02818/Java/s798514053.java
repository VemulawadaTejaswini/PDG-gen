import java.util.Scanner;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int a = Integer.parseInt(stdIn.next());
    int b = Integer.parseInt(stdIn.next());
    int k = Integer.parseInt(stdIn.next());

    int ansA = 0;
    int ansB = 0;
    if (a <= k) {
      ansA = 0;
      ansB = b - (k - a);
      if (ansB < 0) ansB = 0;
    } else {
      ansA = a - k;
      ansB = b;
    }

    System.out.println(ansA + " " + ansB);
  }
}
