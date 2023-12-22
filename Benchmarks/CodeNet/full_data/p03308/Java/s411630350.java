import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int max = 1;
    int min = 1000000000;
    for (int i = 0; i < n; i++) {
      int a = sc.nextInt();
      max = Math.max(a, max);
      min = Math.min(a, min);
    }
    System.out.println(max - min);
  }
}