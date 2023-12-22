import java.util.*;

class Main {

  static char n[];
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    n = sc.next().toCharArray();
    System.out.println(solve(0, 0, 0));
  }
  
  static long solve(int i, long a, long sum) {
    if (i == n.length) return a + sum;
    return solve(i + 1, a * 10 + Integer.valueOf(n[i]-'0'), sum) + solve(i + 1, 0, sum + a);
  }
}
