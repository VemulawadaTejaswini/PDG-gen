import java.util.*;
import java.io.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int H = sc.nextInt();
    int W = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();

    sc.close();

    int[][] s = new int[H][W];

    int[] t = new int[H];
    int[] y = new int[W];

    for (int i = 0; i < H; i++) {
      Arrays.fill(s[i], 0);
    }

    boolean result = true; 

    if (H == 1) {

      for (int i = 0; i < H; i++) {
        for (int j = 0; j < W; j++) {
          if (y[0] < A) {
            s[i][j] = 1;
            y[0]++;
          }
          
        }
      }

      if (y[0] != A) {
        result = false;
      }

    } else if (W == 1) {

      for (int i = 0; i < H; i++) {
        for (int j = 0; j < W; j++) {
          if (t[0] < B){
            s[i][j] = 1;
            t[0]++;
          }
        }
      }

      if (t[0] != B) {
        result = false;
      }

    } else {

      for (int i = 0; i < H; i++) {
        for (int j = 0; j < W; j++) {
          if (t[i] < B){
            if (y[j] < A) {
              s[i][j] = 1;
              t[i]++;
              y[j]++;
            }
          }
        }
      }

      for (int i = 0; i < H; i++) {
        if (t[i] != B) {
          result = false;
          break;
        }
      }
  
      if (result) {
        for (int i = 0; i < W; i++) {
          if (y[i] != A) {
            result = false;
            break;
          }
        }
      }

    }

    PrintWriter out = new PrintWriter(System.out);

    if (result) {
      for (int i = 0; i < H; i++) {
        for (int j = 0; j < W; j++) {
          out.print(s[i][j]);
        }
        out.println();
      }
    } else {
      out.println("No");
    }

    out.flush();

  }

}