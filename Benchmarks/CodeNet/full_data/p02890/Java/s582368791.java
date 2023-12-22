import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    Integer[] a = new Integer[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    System.out.println(n);
    for (int k = 2; k <= n; k++) {
      int rst = 0;
      for (int i = 0; i + k <= n; i += k) {
        Integer[] target = Arrays.copyOfRange(a, i, i + k);
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(target));
        if (target.length == set.size()) {
          rst++;
        }
      }
      System.out.println(rst);
    }


  }
}
