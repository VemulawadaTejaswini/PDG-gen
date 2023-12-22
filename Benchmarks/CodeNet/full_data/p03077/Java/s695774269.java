import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    long N = scan.nextLong();
    long A = scan.nextLong();
    long B = scan.nextLong();
    long C = scan.nextLong();
    long D = scan.nextLong();
    long E = scan.nextLong();

    long min = A;
    String minStr = "A";
    if (min > B) {
      min = B;
      minStr = "B";
    }
    if (min > C) {
      min = C;
      minStr = "C";
    }
    if (min > D) {
      min = D;
      minStr = "D";
    }
    if (min > E) {
      min = E;
      minStr = "E";
    }

    long result = N / min + 5;

    System.out.println(result);
  }
}
