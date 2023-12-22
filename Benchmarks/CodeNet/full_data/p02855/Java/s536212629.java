import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int H = scanner.nextInt();
    int W = scanner.nextInt();
    int K = scanner.nextInt();
    char[][] map = new char[H][W];
    int[][] res = new int[H][W];
    for (int i = 0; i < H; i++) map[i] = scanner.next().toCharArray();
    List<Integer>[] places = new List[W];
    for (int i = 0; i < W; i++) places[i] = new ArrayList<>();
    for (int i = 0; i < H; i++) for (int j = 0; j < W; j++) if (map[i][j] == '#') places[j].add(i);
    for (int i = 0; i < W; i++) if (!places[i].isEmpty()) places[i].set(places[i].size() - 1, H - 1);
    int l = 0;
    for (int i = 0; i < W; i++) if (!places[i].isEmpty()) l = i;
    places[W - 1] = places[l];
    places[l] = new ArrayList<>();

    int px = -1;
    int id = 1;
    for (int i = 0; i < W; i++) {
      if (!places[i].isEmpty()) {
        int py = -1;
        for (int j : places[i]) {
          for (int y = py + 1; y <= j; y++) {
            for (int x = px + 1; x <= i; x++) {
              res[y][x] = id;
            }
          }
          py = j;
          id++;
        }
        px = i;
      }
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        sb.append(res[i][j]).append(' ');
      }
      sb.setLength(sb.length() - 1);
      sb.append('\n');
    }
    System.out.print(sb.toString());
  }
}
