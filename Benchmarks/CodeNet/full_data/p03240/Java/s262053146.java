import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] x = new int[N+1];
    int[] y = new int[N+1];
    int[] h = new int[N+1];
    int[] Hc = new int[N+1];
    for (int i =1; i<N+1; i++) {
      x[i] = sc.nextInt();
      y[i] = sc.nextInt();
      h[i] = sc.nextInt();
    }
    int Cx =0; int Cy =0; int H =0; int count =0;
    for (int i =0; i<101; i++) {
      for (int j =0; j<101; j++) {
        for (int k =1; k<N+1; k++) {
          Hc[k] = h[k] + Math.abs(x[k] - i) + Math.abs(y[k] - j);
        }
        for (int k =1; k<N; k++) {
          if (Hc[k] != Hc[k+1]) continue;
          H = Hc[k];
          if (Hc[k] == Hc[k+1]) count++;
        }
        if (count == N-1) {
          Cx = i;
          Cy = j;
          System.out.println(Cx + " " + Cy + " " + H);
          return;
        }
        count =0;
      }
    }
  }
}