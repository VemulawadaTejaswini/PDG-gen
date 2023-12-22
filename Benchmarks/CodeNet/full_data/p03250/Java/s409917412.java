import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] pa = new int[3];
    pa[0] = sc.nextInt();
    pa[1] = sc.nextInt();
    pa[2] = sc.nextInt();
    Arrays.sort(pa);
    System.out.println(pa[2] * 10 + pa[1] + pa[0]);
  }
}