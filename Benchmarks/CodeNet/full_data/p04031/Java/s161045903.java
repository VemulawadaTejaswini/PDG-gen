import java.util.*;

/**
 * C Main
 *
 * @date 2020.08.22
 * @author 焼き鮭 <yaki-shake@up-tri.me>
 */

public class Main {
  Scanner sc;

  public static void main(String[] args) {
    new Main().execute();
  }

  public void execute() {
    this.sc = new Scanner(System.in);
    int n = this.sc.nextInt();
    int[] a = new int[n];
    int sum = 0;

    for (int i = 0; i < n; i++) {
      a[i] = this.sc.nextInt();
      sum += a[i];
    }

    double avg = sum * 1.0 / n;
    int high = (int) (Math.ceil(avg));
    int low = (int) (Math.floor(avg));

    int totalCostAtHigh = 0;
    for (int i = 0; i < n; i++) {
      totalCostAtHigh += this.cost(a[i], high);
    }
    if (high == low) {
      System.out.println(totalCostAtHigh);
      return;
    }

    int totalCostAtLow = 0;
    for (int i = 0; i < n; i++) {
      totalCostAtLow += this.cost(a[i], low);
    }

    System.out.println(totalCostAtHigh < totalCostAtLow ? totalCostAtHigh : totalCostAtLow);
  }

  public int cost(int from, int to) {
    if (from == to) {
      return 0;
    }

    return (from - to) * (from - to);
  }
}
