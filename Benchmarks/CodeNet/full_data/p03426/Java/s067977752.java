import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    int D = sc.nextInt();
    int A[][] = new int[W*H+1][2];
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        int k = sc.nextInt();
        A[k][0] = i;
        A[k][1] = j;
      }
    }
    int Q = sc.nextInt();
    int[] mp = new int[Q];
    for (int i = 0; i < Q; i++) {
      int L = sc.nextInt();
      int R = sc.nextInt();
      for (int x = L; x < R; x += D) {
        int y = x + D;
        mp[i] += Math.abs(A[x][0] - A[y][0]) + Math.abs(A[x][1] - A[y][1]);
      }
    }
    for (int i = 0; i < Q; i++) {
      System.out.println(mp[i]);
    }
  }
}
