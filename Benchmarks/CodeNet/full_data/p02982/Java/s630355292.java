import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int d = sc.nextInt();
    int[][] x = new int[n][d];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < d; j++) {
        x[i][j] = sc.nextInt();
      }
    }

    int count = 0;

    for (int i = 0; i < n; i++) {
      for (int j = i+1; j < n; j++) {

        int k = 0;

        for (int h = 0; h < d; h++) {
          k += Math.pow(x[i][h]-x[j][h],2);
        }

        int s = (int)Math.sqrt(k);
        if (s*s == k) count++;

      }
    }


    System.out.println(count);

  }

}
