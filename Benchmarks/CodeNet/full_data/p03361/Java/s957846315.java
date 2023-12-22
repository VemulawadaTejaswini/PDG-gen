import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    String ans = "Yes";
    char[][] s = new char[h][w];
    for(int i = 0; i < h; i++) {
      String str = sc.next();
      for(int j = 0; j < w; j++) {
        s[i][j] = str.charAt(j);
      }
    }
    for(int i = 0; i < h; i++) {
      for(int j = 0; j < w; j++) {
        if(s[i][j] == '#') {
          int p = 0;
          if((i >= 1) && (s[i - 1][j] == '#')) p++;
          if((i < (h - 1)) && (s[i + 1][j] == '#')) p++;
          if((j >= 1) && (s[i][j - 1] == '#')) p++;
          if((j < (w - 1)) && (s[i][j + 1] == '#')) p++;
          if(p == 0) ans = "No";
        }
      }
    }
    System.out.println(ans);
  }
}