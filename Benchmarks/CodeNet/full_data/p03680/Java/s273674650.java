import java.util.Scanner;
public class Main {
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int n  = sc.nextInt();
  int[] a = new int[n + 1];
  for (int i = 0; i < n; i++)
    a[i] = sc.nextInt();
  int b = a[0];
  int ans = 1;
  while (b != 2) {
    b = a[b-1];
    ans++;
    if (ans > n) {
      ans = -1;
      break;
    }
  }
  System.out.println(ans);
}}