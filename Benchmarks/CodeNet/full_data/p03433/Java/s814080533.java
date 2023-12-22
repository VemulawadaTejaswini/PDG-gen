import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    int[] xs = Arrays.stream(sc.nextLine().split(" ")).sorted(Comparator.reverseOrder()).mapToInt(Integer::parseInt)
        .toArray();
    long a = 0;
    long b = 0;
    for (int i = 0; i < n; i++) {
      if (i % 2 == 0) {
        a += xs[i];
      } else {
        b += xs[i];
      }
    }
    System.out.println(a - b);
    sc.close();
  }
}
