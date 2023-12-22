import java.util.*;

public class Main {
  private static long solve(int n) {
    long result = 0;
    int i = 1;
    while (i <= n) {
      if (i % 3 != 0 && i % 5 != 0) {
        result += i;
      }
      i ++;
    }
    return result;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(solve(sc.nextInt()));
    sc.close();
  }
}

