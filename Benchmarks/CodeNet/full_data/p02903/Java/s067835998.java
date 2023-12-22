import java.util.*;
import java.io.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int h = sc.nextInt();
    int w = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();

    int[][] s = new int[h][w];

    for (int i = 1; i < h+1; i++) {
      for (int j = 1; j < w+1; j++) {
        if ((i <= a && j <= b) || (i > a && j > b)) {
          System.out.print(0);
        } else {
          System.out.print(1);
        }
      }
      System.out.println("");
    }

  }
}