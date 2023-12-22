import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] p = new int[n];
    int[] q = new int[n];
    for (int i = 0; i < n; i ++) {
        p[i] = sc.nextInt();
    }
    for (int i = 0; i < n; i ++) {
        q[i] = sc.nextInt();
    }

    System.out.println(lexographicalIndex(p, n));
    System.out.println(lexographicalIndex(q, n));
    System.out.println(Math.abs(lexographicalIndex(p, n) - lexographicalIndex(q, n)));
  }

  private static int lexographicalIndex(int[] values, int length) {
      List<Integer> options = new LinkedList<Integer>();
      for (int i = 0; i < length; i++) {
          options.add(i + 1);
      }
      int index = 1;
      for (int i = 0; i < length - 1; i++) {
          int val = options.indexOf(values[i]);
          options.remove(val);
          index += val * factorial(length - i - 1);
      }
      return index;

  }

  private static int factorial(int a) {
      int output = 1;
      for (int i = 1; i <= a; i++) {
          output = output * i;
      }
      return output;
  }
}
