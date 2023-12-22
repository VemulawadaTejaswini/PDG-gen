import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int[] l = new int[n];
    for(int i = 0; i < n; i++) {
      l[i] = sc.nextInt();
    }
    int ans = Integer.MAX_VALUE;
    for(int i = 1; i < (int)Math.pow(4, n); i++) {
      int la = 0;
      int lb = 0;
      int lc = 0;
      int[] num = new int[4];
      for(int j = 0; j < n; j++) {
        int s = i / (int)Math.pow(4, j);
        s = s % 4;
        if(s == 1) {
          la += l[j];
          num[1]++;
        }
        if(s == 2) {
          lb += l[j];
          num[2]++;
        }
        if(s == 3) {
          lc += l[j];
          num[3]++;
        }
      }
      if((la > 0) && (lb > 0) && (lc > 0)) {
        int t = Math.abs(la - a) + Math.abs(lb - b) + Math.abs(lc - c) + 10 * (num[1] - 1) + 10 * (num[2] - 1) + 10 * (num[3] - 1);
        ans = Math.min(ans, t);
      }
    }
    System.out.println(ans);
  }
}