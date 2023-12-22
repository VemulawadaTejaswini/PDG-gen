import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int v[] = new int[5];
    for (int i = 0; i < 5; i++) v[i] = sc.nextInt();
    int k = sc.nextInt();
    System.out.println((v[4] - v[0] <= k) ? "Yay!" : ":(");
  }
}