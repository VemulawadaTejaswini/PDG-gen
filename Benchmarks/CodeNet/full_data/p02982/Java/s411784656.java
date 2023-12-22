import java.util.*;
public class Main {
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int D = sc.nextInt();
    int[][] m = new int[N][D];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < D; j++) {
        m[i][j] = sc.nextInt();
      }
    }
    
    // create square map
    Set<Integer> squares = new HashSet<>();
    for (int i = 0; i*i <= 16000; i++) {
      squares.add(i*i);
    }
    
    // combination(10,2)
    int ans = 0;
    for (int i = 0; i < N-1; i++) {
      for (int j = i+1; j < N; j++) {
        int dist = calc(m, i, j);
        if (squares.contains(dist)) {
          ans++;
        }
      }
    }

    System.out.println(ans);
  }
  
  private static int calc(int[][] m, int a, int b) {

    int ret = 0;
    for (int i = 0; i < m[0].length; i++) {
      int t = Math.abs(m[a][i] - m[b][i]);
      ret += t*t;
    }
    
    return ret;
  }
}
