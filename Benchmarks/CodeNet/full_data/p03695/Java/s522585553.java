import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean[] col = new boolean[8];
    int sp = 0;
    for (int i = 0; i < n; i++) {
      int k = sc.nextInt();
      if (k < 400) {
        col[0] = true;
      } else if (k < 800) {
        col[1] = true;
      } else if (k < 1200) {
        col[2] = true;
      } else if (k < 1600) {
        col[3] = true;
      } else if (k < 2000) {
        col[4] = true;
      } else if (k < 2400) {
        col[5] = true;
      } else if (k < 2800) {
        col[6] = true;
      } else if (k < 3200) {
        col[7] = true;
      } else {
        sp++;
      }
    }
    int min = 0;
    for (boolean c : col) {
      min += c ? 1 : 0;
    }
    int max = Math.min(min + sp, 8);
    System.out.println(min + " " + max);
  }
}