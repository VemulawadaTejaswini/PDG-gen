import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];
      for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
      int[] leftGCD = new int[n];
      leftGCD[0] = arr[0];
      for(int i = 1; i < n; i++) {
        leftGCD[i] = gcd(leftGCD[i - 1], arr[i]);
      }

      int[] rightGCD = new int[n];
      rightGCD[n-1] = arr[n-1];
      for(int i = n-2; i >= 0; i--) {
        rightGCD[i] = gcd(rightGCD[i+1], arr[i]);
      }

      int max = Math.max(rightGCD[1], leftGCD[n-2]);
      for(int i = 1; i < n - 1; i++) {
        max = Math.max(max, gcd(leftGCD[i-1], rightGCD[i+1]));
      }
      System.out.println(max);
  }

  private static int gcd(int a, int b) {
    if(b == 0)
      return a;
    return gcd(b, a % b);
  }
}