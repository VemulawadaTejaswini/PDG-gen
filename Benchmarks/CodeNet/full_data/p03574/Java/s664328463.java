import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    char[][] board = new char[h][w];
    for(int i = 0; i < h; i++) {
      String s = sc.next();
      for(int j = 0; j < w; j++) {
        board[i][j] = s.charAt(j); 
      }
    }
    for(int i = 0; i < h; i++) {
      String ans = "";
      for(int j = 0; j < w; j++) {
        if(board[i][j] == '#') {
          ans += "#";
        } else {
          int ba = 0;
          for(int s = -1; s <= 1; s++) { 
            for(int t = -1; t <= 1; t++) {
              if((s != 0) || (t != 0)) {
                if(((i + s) >= 0) && ((i + s) < h) && ((j + t) >= 0) && ((j + t) < w)) {
                  if(board[i + s][j + t] == '#') ba++;
                }
              }
            }
          }
          ans += (String.valueOf(ba));
        }
      }
      System.out.println(ans);
    }
  }
}