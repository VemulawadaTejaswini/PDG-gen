
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
      System.out.println(-1);
    }

    private static int getGCD(final int a, final int b) {
        if (b > a) {
            return getGCD(b, a);
        }

        if (b == 0) {
            return a;
        }

        return getGCD(b, a % b);
    }
}
