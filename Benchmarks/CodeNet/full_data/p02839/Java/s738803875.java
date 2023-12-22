import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    int[][] map = new int[H][W];
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        map[i][j] = sc.nextInt();
      }
    }

    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        map[i][j] -= sc.nextInt();
      }
    }

    Set<Integer>[][] weightMap = new HashSet[H][W];

    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        Set<Integer> set = new HashSet<Integer>();
        if (i == 0 && j == 0) {
          set.add(map[i][j]);
          set.add(-map[i][j]);
        } else if (i == 0) {
          for (Integer val : weightMap[i][j-1]) {
            set.add(val+map[i][j]);
            set.add(val-map[i][j]);
          }
        } else if (j == 0) {
          for (Integer val : weightMap[i-1][j]) {
            set.add(val+map[i][j]);
            set.add(val-map[i][j]);
          }
        } else {
          for (Integer val : weightMap[i][j-1]) {
            set.add(val+map[i][j]);
            set.add(val-map[i][j]);
          }
          for (Integer val : weightMap[i-1][j]) {
            set.add(val+map[i][j]);
            set.add(val-map[i][j]);
          }
        }
        weightMap[i][j] = set;
      }
    }
    /*
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        int out = Integer.MAX_VALUE;
        for (Integer val : weightMap[i][j]) out = Math.min(out, Math.abs(val));
        System.out.println(out);
      }
    }*/

    int out = Integer.MAX_VALUE;
    for (Integer val : weightMap[H-1][W-1]) out = Math.min(out, Math.abs(val));
    System.out.println(out);
  }
}
