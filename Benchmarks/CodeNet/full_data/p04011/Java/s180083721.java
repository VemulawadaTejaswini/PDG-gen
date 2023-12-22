import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
    int res = 0;
    
    if (n >= k) {
      res += (k * x) + (n - k) * y;
    } else {
      res += (n * x);
    }
    
    System.out.println(res);
  }
}
