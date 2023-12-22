import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int n = s.length();
    int[] leastnums = new int[n + 1];
    for (int i = 0; i < n; i++) {
      if (s.charAt(i) == '<') {
        leastnums[i + 1] = leastnums[i] + 1;
      }
    }
    for (int j = 0; j < n; j++) {
      if (s.charAt(n - 1 - j) == '>' && leastnums[n - 1 - j] <= leastnums[n - j]) {
        leastnums[n - 1 - j] = leastnums[n - j] + 1;
      }
    }
    long count = 0;
    for (int i : leastnums) {
      count += i;
    }
    System.out.println(count);
  }
}
