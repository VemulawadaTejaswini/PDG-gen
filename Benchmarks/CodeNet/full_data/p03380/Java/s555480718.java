import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    Arrays.sort(a);
    int max = a[n-1];
    int m1 = max/2;
    int m2 = (max+1)/2;
    int minDiff = max+10;
    int idx = n-1;
    for (int i = 0; i < n-1; i++) {
      int diff = Math.min(Math.abs(a[i]-m1), Math.abs(a[i]-m2));
      if (minDiff > diff) {
        minDiff = diff;
        idx = i;
      }
    }
    System.out.println(max + " " + a[idx]);
  }
}