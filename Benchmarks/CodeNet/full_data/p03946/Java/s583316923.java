import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.Math;

public class Main {
  private static int N;
  private static int T;
  private static int[] a;

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    N = in.nextInt();
    T = in.nextInt();
    a = new int[N];
    for (int i = 0; i < N; i++) {
      a[i]= in.nextInt();
    }

    int cnt = 1;
    int localt = T / 2;

    int maxDiff = 0;
    for(int i = 0; i < N; i++) {
      for (int j = i + 1; j < N; j++) {
        int diff = a[j] - a[i];
        if (maxDiff == diff) {
          if (localt > 0) {
            cnt++;
            localt--;
          }
        } else if (maxDiff < diff){
          maxDiff = diff;
          cnt = 1;
          localt = T / 2;
        }
      }
    }

    System.out.println(cnt);
  }
}