import java.util.Scanner;

public class Main {
  private static int countPower(int n) {
    int count = 0;
    while (n % 2 == 0) {
      ++count;
      n /= 2;
    }
    return count;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = 100;
    for (int i = 0; i < n; ++i) {
      int a = sc.nextInt();
      ans = Math.min(ans, countPower(a));
    }

    System.out.println(ans);
    
    sc.close(); 
  }
}
