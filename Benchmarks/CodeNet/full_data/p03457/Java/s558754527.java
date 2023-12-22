import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    
    int[] t = new int[n+1];
    int[] x = new int[n+1];
    int[] y = new int[n+1];

    for (int i = 1; i <= n; i++) {
      t[i] = sc.nextInt();
      x[i] = sc.nextInt();
      y[i] = sc.nextInt();
    }

    String ans = "Yes";
    for (int i = 1; i <= n; i++) {
      // 距離と時間の可否チェック
      int dt = t[i] - (i == 1 ? 0 : t[i-1]);
      int dist = Math.abs(x[i] - (i == 1 ? 0 : x[i-1]));
      dist += Math.abs(y[i] - (i == 1 ? 0 : y[i-1]));
      if (dt < dist) {
        ans = "No";
        break;
      }

      // 距離のチェック tが奇数ならxy距離の和も奇数(逆も同じ)
      if (dt % 2 != dist % 2) {
        ans = "No";
        break;
      } 
    }

    System.out.println(ans);

  }
  
}