import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] a = new int[M];
    int[] b = new int[M];
    for (int i=0; i<M; i++) {
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
    }
    for (int i=1; i<N+1; i++) {
      int ans =0;
      for (int j=0; j<M; j++) {
        if (a[j] == i) ans++;
        if (b[j] == i) ans++;
      }
      System.out.println(ans);
    }
   }
}