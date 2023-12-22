import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int nums[] = IntStream.rangeClosed(1,n).toArray();

    double oddSum = 0;
    for (int i=0; i < n; i++) {
      if (nums[i] % 2 != 0) {
        oddSum = oddSum + 1;
      }
    }
    System.out.println(oddSum / n);
  }
}
