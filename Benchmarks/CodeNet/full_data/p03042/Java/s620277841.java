import java.util.*;

class Main {
    public static void main(final String[] args) {
      Scanner sc = new Scanner(System.in);
      int s = sc.nextInt();
      int f = s/100;
      int b = s%100;

      if (f == 0 && b == 0) {
        System.out.println("NA");
        System.exit(0);
      }
      if ((f >= 1 && f <= 12) && (b >= 1 && b <= 12)) {
        System.out.println("AMBIGUOUS");
        System.exit(0);
      }
      if (f >= 1 && f <= 12) {
        System.out.println("MMYY");
        System.exit(0);
      } else {
        if (b >= 1 && b <= 12) {
          System.out.println("YYMM");
          System.exit(0);
        }
      }
      System.out.println("NA");
      System.exit(0);
    }
}