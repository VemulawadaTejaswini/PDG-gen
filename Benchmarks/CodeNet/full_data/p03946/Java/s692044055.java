import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
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
    int localt = (T / 2) - 1;

    int maxDiff = Integer.MIN_VALUE;
    int min = a[0];
    for(int i = 1; i < N; i++) {
      if (min > a[i - 1]) {
        min = a[i - 1]; 
      }   
      int diff = a[i] - min;
      if (diff <= 0) {
        continue;
      }   
      if (maxDiff < diff) {
        maxDiff = diff;
        cnt = 1;
        localt = (T / 2) - 1;
      } else if (maxDiff == diff && localt > 0) {
        cnt++;
        localt--;
      }   
    }   

    System.out.println(cnt);
  }
}