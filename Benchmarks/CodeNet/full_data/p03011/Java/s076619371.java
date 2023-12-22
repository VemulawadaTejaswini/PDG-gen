import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String[] m = s.split(" ");
    int ans = 100;
    int[] n = new int[m.length];
    for (int i = 0; i < m.length; i++) {
      n[i] = Integer.parseInt(m[i]);
    }
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m.length; j++) {
        int tmp = 0;
        if (i != j) {
          tmp = n[i] + n[j];
          if (ans > tmp)
            ans = tmp;
        }

      }
    }
    System.out.println(ans);
  }
}