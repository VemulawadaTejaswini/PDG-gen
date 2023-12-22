import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] a = new int[n];
    int[] b = new int[2000];

    int max = 0;
    int min = 999;
    int bcnt = 0;
    int bmax = 0;
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
      max = Math.max(max, a[i]);
      min = Math.min(min, a[i]);
      int j = (a[i] < 0 ? Math.abs(a[i])+1000 : a[i]);
      b[j]++;
      if (b[j] > bcnt) {
        bmax = a[i];
        bcnt = b[j];
      }
    }

    int avg = (max + min) / 2;
    double cost1 = 0;
    double cost2 = 0;
    for (int i = 0; i < n; i++) {
      if (a[i] != avg) cost1 += Math.pow(Math.abs(a[i] - avg), 2);
      if (a[i] != bmax) cost2 += Math.pow(Math.abs(a[i] - bmax), 2);
    }

    int cost = (int)Math.min(cost1, cost2);
    System.out.println(cost);
  }
}