import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt(); 
    char[][] a = new char[H+1][W+1];
    int[] checkH = new int[W+1];
    int[] checkW = new int[H+1];
    for (int i=0; i<H; i++) {
      a[i] = sc.next().toCharArray();
    }
    for (int i=0; i<H; i++) {
      for (int j=0; j<W; j++) {
        if(a[i][j] == '.') checkH[i]++;
        }
      if (checkH[i] == W) {
        for (int j=0; j<W; j++) {
          a[i][j] = '0';
        }
      }
    }
    for (int j=0; j<W; j++) {
      for (int i=0; i<H; i++) {
        if(a[i][j] == '.' || a[i][j] == '0') checkW[j]++;
        }
      if (checkW[j] == H) {
        for (int i=0; i<H; i++) {
          a[i][j] = '0';
        }
      }  
    }
    for (int i=0; i<H; i++) {
      if(checkH[i] == W) continue;
      for (int j=0; j<W; j++) {
        if(a[i][j] == '0') continue;
        System.out.print(a[i][j]);
      }
      System.out.println();
    }
  }
}