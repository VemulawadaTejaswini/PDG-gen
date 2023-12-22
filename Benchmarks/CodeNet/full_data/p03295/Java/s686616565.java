import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] desire = new int[m][2];
    for(int i = 0; i < m; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      desire[i][0] = a;
      desire[i][1] = b;
    }
    Arrays.sort(desire, new Comparator<int[]>() {
      @Override
      public int compare(int[] o1, int[] o2) {
        return o1[1] - o2[1];
      }
    });
    int ans = 0;
    int p = -1;
    for(int i = 0; i < m; i++) {
      if(p < desire[i][0]) {
        ans++;
        p = desire[i][1] - 1;
      }
    }
    System.out.println(ans);
  }
}