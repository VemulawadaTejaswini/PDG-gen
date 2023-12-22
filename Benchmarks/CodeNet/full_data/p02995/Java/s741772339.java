import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    long A = scn.nextLong();
    long B = scn.nextLong();
    long C = scn.nextLong();
    long D = scn.nextLong();

    long multiple_C_num = (A - 1) / C;
    long multiple_D_num = (A - 1) / D;
    long multiple_CD_num = multiple_C_num + multiple_D_num - ((A - 1) / lcm(C, D));
    long notMultiple_num_A = (A - 1) - multiple_CD_num;
    if (notMultiple_num_A < 0) {
      notMultiple_num_A = 0;
    }

    multiple_C_num = B / C;
    multiple_D_num = B / D;
    multiple_CD_num = multiple_C_num + multiple_D_num - (B / lcm(C, D));
    long notMultiple_num_B = B - multiple_CD_num;
    if (notMultiple_num_B < 0) {
      notMultiple_num_B = 0;
    }

    System.out.println(notMultiple_num_B - notMultiple_num_A);

  }

  public static long gcd(long a, long b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);

  }

  public static long lcm(long a, long b) {
    return (a * b) / gcd(a, b);
  }
}