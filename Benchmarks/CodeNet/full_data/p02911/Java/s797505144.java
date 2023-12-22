import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt();
    int q = sc.nextInt();

    int[] a = new int[q];
    int[] p = new int[n+1];

    for (int i = 0; i < q; i++) {
      a[i] = sc.nextInt();  // 正解した参加者
    }

    for (int i = 1; i < n+1; i++) {
      p[i] = k;  // ポイント
    }

    for (int i = 0; i < q; i++) {
      for (int j = 1; j < n+1; j++) {
        if(a[i] != j) p[j]--;
      }
    }

    for (int i = 1; i < n+1; i++) {
      if(p[i] > 0) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }

  }
}
