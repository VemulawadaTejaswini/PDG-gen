import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  private final static List<String> permutation = new ArrayList<>();

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int[] x = new int[n];
    int[] y = new int[n];

    StringBuilder input = new StringBuilder();
    for (int i = 0; i < n; i++) {
      x[i] = sc.nextInt();
      y[i] = sc.nextInt();
      input.append(i + 1);
    }

    permutation(input.toString(), "");
    BigDecimal sum = new BigDecimal(0);
    for (String s : permutation) {
      for (int j = s.length(); j > 1; j--) {
        int firstIndex = Character.getNumericValue(s.charAt(j - 1)) - 1;
        int secondIndex = Character.getNumericValue(s.charAt(j - 2)) - 1;
        int xSum = x[firstIndex] - x[secondIndex];
        int ySum = y[firstIndex] - y[secondIndex];
        sum = sum.add(BigDecimal.valueOf(Math.sqrt(Math.pow(xSum, 2) + Math.pow(ySum, 2))));
      }
    }
    System.out.println(sum.divide(new BigDecimal(permutation.size()), 8, RoundingMode.DOWN).doubleValue());
  }

  public static void permutation(String q, String ans) {
    if (q.length() <= 1) {
      permutation.add(ans + q);
    } else {
      for (int i = 0; i < q.length(); i++) {
        permutation(q.substring(0, i) + q.substring(i + 1),
            ans + q.charAt(i));
      }
    }
  }
}
