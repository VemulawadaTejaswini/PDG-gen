
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

//    Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);

    int n = cin.nextInt();
    int[] num = new int[n];

    for (int i = 0; i < n; i++) {
      num[i] = cin.nextInt();
    }

    int[] right = new int[n + 1];

    for (int i = n - 1; i > 0; i--) {
      right[i] = calGCD(num[i], right[i + 1]);
    }

    int res = 0;
    int left = 0;
    for (int i = 0; i < n; i++) {
      res = Math.max(calGCD(left, right[i + 1]), res);
      left = calGCD(left, num[i]);
    }
    System.out.println(res);

  }

  private static int calGCD(int a, int b) {
    if (a == 0 || b == 0) {
      return a == 0 ? b : a;
    }
    if (a >= b) {
      return calGCD(b, a % b);
    } else {
      return calGCD(a, b % a);
    }
  }


}
