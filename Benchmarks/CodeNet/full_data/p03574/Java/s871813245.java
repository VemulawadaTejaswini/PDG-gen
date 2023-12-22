import java.io.*;
import java.util.*;

//二次元配列
//先に周囲8ますに存在する爆弾の個数を記録した配列を作成、
//次いで爆弾ならば数字を置き換える

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    //8箇所
    int[] dx = {-1,-1,-1, 0,0, 1,1,1};
    int[] dy = {-1, 0, 1,-1,1,-1,0,1};
    int h  = sc.nextInt();
    int w  = sc.nextInt();
    // char[][] bomb = new char
    String bomb = "#";
    char[] charBomb = bomb.toCharArray();
    String[] s = new String[h];
    for (int i = 0; i < h; i++) {
      s[i] = sc.next();
    }
    int[][] board = new int[h][w];
    for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) {
        if(s[i].charAt(j) == charBomb[0]){
            for (int k = 0; k < 8; k++) {
              if(0 <= i+dy[k] && i+dy[k] <= h && 0 <= j+dx[k] && j+dx[k] <= w){
                board[i+dy[k]][j+dx[k]]++;
              }
            }

        }
      }
    }
    for(int i = 0; i < h; i++){
      for(int j = 0; j < w; j++){
          if(s[i].charAt(j) == charBomb[0]){
            System.out.print(charBomb[0]);
          }else{
            System.out.print(board[i][j]);
          }
      }
      System.out.println(" ");
    }

  }
}
