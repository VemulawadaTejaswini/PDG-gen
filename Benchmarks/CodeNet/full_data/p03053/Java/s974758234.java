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


  private static int resolve(char[][] a) {
    int count = 0;
    while (!update(a)) {
      count++;
      for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[i].length; j++) {
          if (a[i][j] == '.' && hasBlack(a, i, j)) {
            // mark
            a[i][j] = '*';
          }
        }
      }
    }
    return count;
  }
  
  private static boolean hasBlack(char[][] a, int i, int j) {
    // up
    return 0 < i && a[i-1][j] == '#'
    // down
      || i < a.length - 1 && a[i+1][j] == '#'
    // left
      || 0 < j && a[i][j-1] == '#'
    // right
      || j < a[i].length - 1 && a[i][j+1] == '#';
  }
 
  private static boolean update(char[][] a) {
    boolean allBlack = true;
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        if (a[i][j] == '*') {
          a[i][j] = '#';
        } else if (a[i][j] == '.') {
          allBlack = false;
        }
      }
    }
    return allBlack;
  }
}