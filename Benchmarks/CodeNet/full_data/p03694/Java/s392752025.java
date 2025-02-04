import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int min = 10000;
    int max = 0;
    for (int i = 0; i < n; i++) {
      int k = sc.nextInt();
      min = Math.min(min, k);
      max = Math.max(max, k);
    }
    System.out.println(max - min);
  }
}