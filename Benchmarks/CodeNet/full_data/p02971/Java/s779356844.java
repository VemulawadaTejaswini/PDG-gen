import java.util.Scanner;

class Main {
  private static void solve(int n, int[] a) {
    Integer first = null;
    Integer second = null;
    int count = 0;
    for (int val : a) {
      if (first == null || first < val) {
        second = first;
        first = val;
        count = 1;
      } else if (first == val) {
        count += 1;
      } else if (second == null || second < val) {
        second = val;
      }
    }
    int[] result = new int[n];
    for (int i = 0; i < n; i++) {
      if (a[i] != first) {
        result[i] = first;
      } else if (count > 1) {
        result[i] = first;
      } else {
        result[i] = second;
      }
    }
    for (int val : result) {
      System.out.println(val);
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(sc.nextLine());
    }
    sc.close();
    solve(n, a);
  }
}