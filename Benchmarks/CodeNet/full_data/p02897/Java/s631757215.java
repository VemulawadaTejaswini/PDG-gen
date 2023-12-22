
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int numOdd = 0;
    if (N %2==0) {
      numOdd = N / 2;
    } else {
      numOdd = N / 2 + 1;
    }
    System.out.println(numOdd / (float) N);
  }
}
