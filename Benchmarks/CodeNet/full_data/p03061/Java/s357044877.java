
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Integer n = Integer.parseInt(sc.nextLine());
    List<Integer> b = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt)
        .collect(Collectors.toList());

    Integer[] left = new Integer[n + 1];
    left[0] = 0;
    for (int i = 0; i < n; i++) {
      left[i + 1] = gcd(b.get(i), left[i]);
    }

    Integer[] right = new Integer[n + 1];
    right[n] = 0;
    for (int i = n; i > 0; i--) {
      right[i - 1] = gcd(b.get(i - 1), right[i]);
    }

    int max = 0;
    for (int i = 0; i < n; i++) {
      max = Math.max(max, gcd(left[i], right[i + 1]));
    }

    System.out.println(max);
  }

  public static int gcd(int a, int b) {
    if (b == 0) {
      return a;
    }

    return gcd(b, a % b);
  }
}
