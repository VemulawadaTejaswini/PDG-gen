import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int c = sc.nextInt();
    int[][] iwa = new int[c][c];
    for(int i = 0; i < c; i++) {
      String aho = sc.next();
      for(int j = 0; j < c; j++) {
        iwa[i][j] = Integer.parseInt(String.valueOf(aho.charAt(j)));
      }
    }
    int[][] color = new int[n][n];
    for(int i = 0; i < n; i++) {
      String baka = sc.next();
      for(int j = 0; j < n; j++) {
        color[i][j] = Integer.parseInt(String.valueOf(baka.charAt(j)));
      }
    }
    int ans = 100000000;
    for(int i = 0; i < c; i++) {
      for(int j = 0; j < c; j++) {
        if(i == j) break;
        for(int k = 0; k < c; k++) {
          if(j == k) break;
          int sum = 0;
          for(int s = 0; s < n; s++) {
            for(int t = 0; t < n; t++) {
              if((s + t) % 3 == 0) {
                sum += iwa[color[s][t] - 1][i];
              } else if((s + t) % 3 == 1) {
                sum += iwa[color[s][t] - 1][j];
              } else {
                sum += iwa[color[s][t] - 1][k];
              }
            }
          }
          ans = Math.min(ans, sum);
        }
      }
    }
    System.out.println(ans);
  }
}
