import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] d = new int[10];
    for(int i = 0; i < k; i++) {
      int dd = sc.nextInt();
      d[dd] = 1;
    }
    int ans = 0;
    for(int i = n; i < 100000; i++) {
      String str = String.valueOf(i);
      int p = 0;
      for(int j = 0; j < str.length(); j++) {
        int d1 = Integer.parseInt(String.valueOf(str.charAt(j)));
        if(d[d1] == 1) p++;
      }
      if(p == 0) {
        ans = i;
        break;
      }
    }
    System.out.println(ans);
  }
}