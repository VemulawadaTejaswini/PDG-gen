import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();//to String
    if (N < 10) {
      System.out.println(N);
      return;
    }
    
    long ans = 0;
    long ans2 = 0;
    while (N > 0) {
      if (N < 10) {
        ans += N -1;
        ans2 += N;
        break;
      }
      ans += 9;
      ans2 += N % 10;
      N /= 10;
    }
    System.out.println(Math.max(ans, ans2));
  }
}
    
    