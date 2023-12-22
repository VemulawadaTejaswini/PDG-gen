import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int H = sc.nextInt();
      int W = sc.nextInt();
      int[][] a = new int[H][W];
      for (int i = 0; i < H * W; i++) {
        a[(int) i / W][(int) i % W] = sc.nextInt();
      }
      print(solve(a));
    }
  }

  public static int[][] solve(int[][] a) {
    int[][] r = new int[a.length * a[0].length][4];
    int rlen = 0;
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[0].length; j++) {
        rlen = solve2(i, j, a, r, rlen);
      }
    }
    return r;
  }

  public static int solve2(int x, int y, int[][] a, int[][] r, int rlen) {
    if (a[x][y] % 2 == 0) {
      return rlen;
    }
    if (x + 1 < a.length) {
      if (a[x + 1][y] == 1) {
        a[x][y]--;
        a[x + 1][y] += 1;
        setRoute(r, rlen, x, y, x + 1, y);
        return rlen + 1;
      }
    }
    if (y + 1 < a[0].length) {
      if (a[x][y + 1] == 1) {
        a[x][y]--;
        a[x][y + 1] += 1;
        setRoute(r, rlen, x, y, x, y + 1);
        return rlen + 1;
      }
    }
    if (x + 1 < a.length) {
      a[x][y]--;
      a[x + 1][y] += 1;
      setRoute(r, rlen, x, y, x + 1, y);
      return rlen + 1;
    }
    if (y + 1 < a[0].length) {
      a[x][y]--;
      a[x][y + 1] += 1;
      setRoute(r, rlen, x, y, x, y + 1);
      return rlen + 1;
    }
    return rlen;
  }

  public static void setRoute(int[][] r, int pos, int x, int y, int x2, int y2) {
    r[pos][0] = x;
    r[pos][1] = y;
    r[pos][2] = x2;
    r[pos][3] = y2;
  }

  public static void print(int[][] r) {
    int print = r.length;
    for (int i = 0; i < r.length; i++) {
      if (r[i][0] == 0 && r[i][1] == 0 && r[i][2] == 0 && r[i][3] == 0) {
        print = i;
        break;
      }
    }
    System.out.println(print);
    for (int i = 0; i <= print; i++) {
      if (r[i][0] == 0 && r[i][1] == 0 && r[i][2] == 0 && r[i][3] == 0) {
        break;
      }
      System.out.println(IntStream.of(r[i]).map(e -> e + 1).mapToObj(String::valueOf)
          .collect(Collectors.joining(" ")));
    }
  }
}