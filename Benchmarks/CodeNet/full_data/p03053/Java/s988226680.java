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
    
    Queue<List<Integer>> queue = new LinkedList<List<Integer>>();

    // initial scan
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        if (a[i][j] == '#') {
          queue.add(Arrays.asList(i, j, 0));
        }
      }
    }
    
    int max = 0;
    while (!queue.isEmpty()) {
      List<Integer> node = queue.remove();
      for (int v = 0; v < 4; v++) {
        int i = node.get(0) + dy[v];
        int j = node.get(1) + dx[v];
        int length = node.get(2) + 1;
        if (i < 0 || a.length <= i || j < 0 || a[i].length <= j) {
          continue;
        }
        if (a[i][j] == '.') {
          a[i][j] = '#';
          queue.add(Arrays.asList(i, j, length));
          max = Math.max(max, length);
        }
      }
    }

    return max;
  }
}
