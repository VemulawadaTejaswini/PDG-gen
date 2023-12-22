import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(), k = sc.nextInt();
    int ans = 0;
    for(int i = 0; i < n; i++) {
      int a = sc.nextInt();
      if (a == 1) {
        ans = i / (k-1) + (i % (k-1) != 0 ? 1 : 0) + (n-i-1) / (k-1) + ((n-i-1) % (k-1) != 0 ? 1 : 0);
      }
    }
    System.out.println(ans);
  }
}