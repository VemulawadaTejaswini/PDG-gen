import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    char[][] a = new char[H][W];
    for (int i = 0; i < H; i++) {
      a[i] = sc.next().toCharArray();
    }
    for (int i = 0; i < W + 2; i++) {
      System.out.print("#");
    }
    System.out.println();
    for (int i = 0; i < H; i++) {
      System.out.print("#");
      for (int j = 0; j < W; j++) {
        System.out.print(a[i][j]);
      }
      System.out.println("#");
    }
    for (int i = 0; i < W + 2; i++) {
      System.out.print("#");
    }
    System.out.println();
  }
}
