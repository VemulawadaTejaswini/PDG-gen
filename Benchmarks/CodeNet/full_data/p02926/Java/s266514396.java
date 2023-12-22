import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int xy[][] = new int[n][2];

    List<Integer> quadrant1 = new ArrayList<>();
    List<Integer> quadrant2 = new ArrayList<>();
    List<Integer> quadrant3 = new ArrayList<>();
    List<Integer> quadrant4 = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      int x = Integer.parseInt(sc.next());
      int y = Integer.parseInt(sc.next());
      xy[i][0] = x;
      xy[i][1] = y;
      if (x >= 0) {
        if (y >= 0) {
          quadrant1.add(i);
        } else {
          quadrant4.add(i);
        }
      } else {
        if (y >= 0) {
          quadrant2.add(i);
        } else {
          quadrant3.add(i);
        }
      }
    }
    long[] total1 = total(quadrant1, xy);
    long[] total2 = total(quadrant2, xy);
    long[] total3 = total(quadrant3, xy);
    long[] total4 = total(quadrant4, xy);
    long max = Math.max(0, appendPow(total1, xy, quadrant2));
    max = Math.max(max, appendPow(total1, xy, quadrant4));
    max = Math.max(max, appendPow(total2, xy, quadrant1));
    max = Math.max(max, appendPow(total2, xy, quadrant3));
    max = Math.max(max, appendPow(total3, xy, quadrant2));
    max = Math.max(max, appendPow(total3, xy, quadrant4));
    max = Math.max(max, appendPow(total4, xy, quadrant1));
    max = Math.max(max, appendPow(total4, xy, quadrant3));
    pw.println(Math.sqrt(max));
  }

  static long[] append(long[] totalXy, int[][] allXy, List<Integer> other) {
    long max = totalXy[0] * totalXy[0] + totalXy[1] * totalXy[1];
    long[] ans = totalXy;
    for (int index : other) {
      long[] n = new long[2];
      n[0] = ans[0] + allXy[index][0];
      n[1] = ans[1] + allXy[index][1];
      long nPow = n[0] * n[0] + n[1] * n[1];
      if (max < nPow) {
        ans = n;
        max = nPow;
      }
    }
    return ans;
  }

  static long appendPow(long[] totalXy, int[][] allXy, List<Integer> other) {
    long ans[] = append(totalXy, allXy, other);
    return ans[0] * ans[0] + ans[1] * ans[1];
  }

  static long[] total(List<Integer> indexes, int xy[][]) {
    long xTotal = indexes.stream().mapToLong(i -> xy[i][0]).sum();
    long yTotal = indexes.stream().mapToLong(i -> xy[i][1]).sum();
    long[] total = {xTotal, yTotal};
    return total;
  }

  static long distancePow(List<Integer> indexes, int xy[][]) {
    long xTotal = indexes.stream().mapToLong(i -> xy[i][0]).sum();
    long yTotal = indexes.stream().mapToLong(i -> xy[i][1]).sum();
    return xTotal * xTotal + yTotal * yTotal;
  }
}
