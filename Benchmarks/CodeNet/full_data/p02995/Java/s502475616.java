import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    long A = scan.nextLong();
    long B = scan.nextLong();
    long C = scan.nextLong();
    long D = scan.nextLong();
    long CD = leastCommonMultiple(C, D);

    long i;
    if (A % C == 0) {
      i = A / C;
    } else {
      i = A / C + 1;
    }
    long j;
    if (A % D == 0) {
      j = A / D;
    } else {
      j = A / D + 1;
    }
    long k;
    if (A % CD == 0) {
      k = A / CD;
    } else {
      k = A / CD + 1;
    }
    long cStart = i;
    long dStart = j;
    long cdStart = k;
    long cEnd;
    long dEnd;
    long cdEnd;

    while (true) {
      if (++i * C > B) {
        cEnd = i - 1;
        break;
      }
    }
    while (true) {
      if (++j * D > B) {
        dEnd = j - 1;
        break;
      }
    }
    while (true) {
      if (++k * CD > B) {
        cdEnd = k - 1;
        break;
      }
    }


    long cn = cEnd - cStart + 1;
    long dn = dEnd - dStart + 1;
    long cdn = cdEnd - cdStart + 1;

    long result = B - A + 1 - cn - dn + cdn;

    System.out.println(result);

  }

  private static long leastCommonMultiple(long a, long b) {
    long temp;
    long c = a;
    c *= b;
    while ((temp = a % b) != 0) {
      a = b;
      b = temp;
    }
    return c / b;
  }
}

