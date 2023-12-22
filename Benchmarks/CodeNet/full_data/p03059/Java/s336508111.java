import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();

    char[][] A = new char[H][W];
    for (int i = 0; i < H; i++) {
      String line = sc.next();
      for (int j = 0; j < line.length(); j++) {
        A[i][j] = line.charAt(j);
      }
    }
    
    int ans = resolve(A);
    
    System.out.println(ans);
    //System.out.println(Arrays.deepToString(A));
  }
  
  // up, down, left, right
  private static final int[] dx = { 0, 0, -1, 1 };
  private static final int[] dy = { -1, 1, 0, 0 };

  private static int resolve(char[][] a) {
    
    Queue<Node> queue = new ArrayDeque<Node>();

    // initial scan
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        if (a[i][j] == '#') {
          queue.add(new Node(j, i, 0));
        }
      }
    }
    
    int max = 0;
    while (!queue.isEmpty()) {
      Node node = queue.remove();
      for (int i = 0; i < 4; i++) {
        int x = node.x + dx[i];
        int y = node.y + dy[i];
        int distance = node.distance + 1;
        if (y < 0 || a.length <= y || x < 0 || a[y].length <= x) {
          continue;
        }
        if (a[y][x] == '.') {
          a[y][x] = '#';
          queue.add(new Node(x, y, distance));
          max = Math.max(max, distance);
        }

      }
    }

    return max;
  }
  
  static class Node {
    final int x;
    final int y;
    final int distance;
    Node(int x, int y, int distance) {
      this.x = x;
      this.y = y;
      this.distance = distance;
    }
  }
}
