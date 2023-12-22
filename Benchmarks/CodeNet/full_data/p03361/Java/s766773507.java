import java.io.*;
import java.util.*;


class Main{
  public static void main(String[] args){
    int[] dx = {-1, 0,0,1};
    int[] dy = { 0,-1,1,0};

    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    String bomb = "#";
    char[] charBomb = bomb.toCharArray();
    String[] s = new String[h];
    for (int i = 0; i < h; i++) {
      s[i] = sc.next();
    }
    int[][] map = new int[100][100];
    for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) {
        if(s[i].charAt(j) == charBomb[0]){
            for(int k = 0; k < 4; k++){
                if(0 <= i+dy[k] && i+dy[k] <= h && 0 <= j+dx[k] && j+dx[k] <= w){
                  map[ i+dy[k] ][ j+dx[k] ]++;
                }
            }
        }
      }
    }
    boolean can = true;
    for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) {
        if(s[i].charAt(j) == charBomb[0] && map[i][j] ==0){
          can = false;
        }
      }
    }

    if(can){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}
