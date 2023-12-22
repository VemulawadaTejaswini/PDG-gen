import java.util.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int a_max = -1;
    int a_max_index = -1;
    for (int i = 0; i < n; i++) {
      int ai = sc.nextInt();;
      a[i] = ai;
      if (ai > a_max) {
        a_max = ai;
        a_max_index = i;
      }
    }

    double a_max_half = a_max / 2.0;
    double diff_min = Double.MAX_VALUE;
    int r = -1;
    for (int i = 0; i < n; i++) {
      if (i == a_max_index) {
        continue;
      }
      if (Math.abs(a[i] - a_max_half) < diff_min) {
        diff_min = Math.abs(a[i] - a_max_half);
        r = a[i];
      }
    }

    System.out.println(a_max + " " + r);
  }
}
