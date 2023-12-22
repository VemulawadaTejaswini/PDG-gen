import java.util.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int x = sc.nextInt();
    int cost_n = 0;

    for (int i = 0; i < m; i++) {
      int am = sc.nextInt();
      if (am > x) {
        cost_n++;
      }
    }

    System.out.println(Math.min(cost_n, m - cost_n));
  }
}
