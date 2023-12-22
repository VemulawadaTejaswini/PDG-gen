import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    final int h = scanner.nextInt();
    final int w = scanner.nextInt();
    final List<int[]> rows = new ArrayList<>();
    final List<Integer> rowSums = new ArrayList<>();
    for (int i = 0; i < h; i++) {
      int[] row = new int[w];
      int rowSum = 0;
      String s = scanner.next();
      for (int j = 0; j < w; j++) {
        row[j] = s.charAt(j) - 'a';
        rowSum += row[j];
      }
      rows.add(row);
      rowSums.add(rowSum);
    }
    if (possible(rows, rowSums)) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }

  private static boolean possible(List<int[]> rows, List<Integer> rowSums) {
    final int h = rows.size();
    for (int i = 0; i < h / 2 + 1 && !rows.isEmpty(); i++) {
      int[] row = rows.remove(0);
      int sum = rowSums.remove(0);
      boolean found = false;
      for (int j = 0; j < rowSums.size(); j++) {
        if (rowSums.get(j) == sum && convertible(row, rows.get(j))) {
          rows.remove(j);
          rowSums.remove(j);
          found = true;
          break;
        }
      }
      if (!found) {
        rows.add(row);
        rowSums.add(sum);
      }
    }
    if (rows.isEmpty()) return true;
    if (rows.size() > 1) return false;
    int[] row = rows.get(0);
    int i = 0, j = row.length - 1;
    while (i < j && row[i] == row[j]) {
      i++;
      j--;
    }
    return i >= j;
  }

  private static boolean convertible(int[] row, int[] other) {
    HashSet<Pair> set = new HashSet<>();
    for (int i = 0; i < row.length; i++) {
      Pair p = new Pair(row[i], other[i]);
      if (set.contains(p)) set.remove(p);
      else set.add(p);
    }
    if (set.size() > 1) return false;
    for (Pair p : set) {
      return p.first == p.second;
    }
    return true;
  }

  static class Pair {
    public final int first;
    public final int second;

    Pair(int first, int second) {
      this.first = first;
      this.second = second;
    }

    @Override public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Pair pair = (Pair) o;
      return first == pair.second &&
          second == pair.first;
    }

    @Override public int hashCode() {
      return first + second;
    }
  }
}
