import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      long A = in.nextLong();
      long B = in.nextLong();

      System.out.println(f(A - 1, B));
    }
  }

  public static long f(long a, long b) {
    return f(a) ^ f(b);
  }

  // f(a) = f(0, a)
  public static long f(long a) {
    long pair = (a + 1) / 2;

    if (pair % 2 == 1) {
      if (a % 2 == 0) {
        return 1 ^ a;
      } else {
        return 1; 
      }
    } else {
      if (a % 2 == 0) {
        return a; // 0 ^ a = a
      } else {
        return 0; 
      }
    }
  }
}