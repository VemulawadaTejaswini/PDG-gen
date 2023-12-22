import java.io.*;
import java.util.*;

//すべてのマスが満たすべき条件の時は、ある変数の値を0,正で分けることがフラグ
//break, continueはループを1つしか抜けない
//外側まで抜けるにはラベル付きfo,continueが必要

class Main{
  public static void main(String[] args){
    int[] dx = {-1, 0,0,1};
    int[] dy = { 0,-1,1,0};

    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    // String[] s = new String[100];
    //オリジナルマップ作製
    char[][] original = new char[h+2][w+2];
    for (int i = 0; i < h; i++) {
      String s = sc.next();
      for (int j = 0; j < w; j++) {
        original[i][j] = s.charAt(j);
      }
    }

    boolean canpaint = true;
    String bomb = "#";
    char[] charBomb = bomb.toCharArray();
    int[][] map = new int[100][100];
    loop: for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
              if(original[i][j] == charBomb[0]){
                int count = 0;
                // boolean exist = true;
                for(int k = 0; k < 4; k++){
                  //領域内かどうか
                  if(0 <= i+dy[k] && i+dy[k] <= h && 0 <= j+dx[k] && j+dx[k] <= w){
                    //安全地帯の個数数え上げ
                    if( original[i+dy[k]][j + dx[k]] == charBomb[0]) count++;
                  }

                }

                //4つ数え終わってからcountの値集計！！
                //周囲に１つも爆弾無い(4つとkも安全)の時
                if(count == 0) {
                  canpaint = false;
                  break loop;
                }

              }
            }
    }
    // boolean can = true;
    // for (int i = 0; i < h; i++) {
    //   for (int j = 0; j < w; j++) {
    //     if(s[i].charAt(j) == charBomb[0] && map[i][j] == 0){
    //       can = false;
    //     }
    //   }
    // }

    if(canpaint){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}
