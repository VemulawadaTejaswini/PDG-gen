import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int[][] candy = new int[n][2];
    for(int i = 0; i < n; i++) {
      candy[i][0] = Integer.parseInt(sc.next());
    }
    for(int i = 0; i < n; i++) {
      candy[i][1] = Integer.parseInt(sc.next());
    }
    for(int i = 1; i < n; i++) {
      candy[i][0] += candy[i-1][0];
    }
    candy[0][1] += candy[0][0];
    for(int i = 1; i < n; i++) {
      candy[i][1] += Math.max(candy[i-1][1], candy[i][0]);
    }
    System.out.println(candy[n-1][1]);
  }
}
