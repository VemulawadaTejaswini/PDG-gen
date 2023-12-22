import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      boolean[] hit = new boolean[9];
      int[] a = new int[9];
      for (int i = 0; i < 9; i++) a[i] = sc.nextInt();
      
      int n = sc.nextInt();
      for (int i = 0; i < n; i++) {
        int b = sc.nextInt();
        for (int j = 0; j < 9; j++) {
          if (b == a[j]) hit[j] = true;
        }
      }

      int[][] lines = {
        { 0, 1, 2 },
        { 3, 4, 5 },
        { 6, 7, 8 },
        { 0, 3, 6 },
        { 1, 4, 7 },
        { 2, 5, 8 },
        { 0, 4, 8 },
        { 2, 4, 6 },
      };

      boolean ans = false;
      for (int i = 0; i < 8; i++) {
        boolean chk = true;
        for (int j = 0; j < 3; j++) {
          if (!hit[lines[i][j]]) chk = false;
        }
        if (chk) ans = true;
      }

      if (ans) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    } finally {
      sc.close();
    }
  }
}