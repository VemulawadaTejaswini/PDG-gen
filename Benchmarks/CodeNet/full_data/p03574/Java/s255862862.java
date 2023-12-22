//ムリ
import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    String blank = sc.nextLine();
    char[][] ary = new char[h][w];
    char[][] cntary = new char[h][w];

    for(int i = 0; i < h; i++){
      String s = sc.nextLine();
      ary[i] = s.toCharArray();
    }

    int[] dx = {-1, 0, -1};
    int[] dy = {-1, 0, -1};
    int tmpx, tmpy = 0;
    for(int i = 0; i < h; i++){
      for(int j = 0; j < w; j++){
        if(ary[i][j] == '#'){cntary[i][j]='#'; continue;}

        for(int k = 0; k < 3; k++){
          for(int l = 0; l < 3; l++){
            tmpx = i + dx[k];
            tmpy = j + dy[l];
            if(tmpx>=0 && tmpy>=0){
              if(ary[tmpx][tmpy] == '#'){
              //char型配列にint型を入れる処理
              //そのマス目の隣接８方向の爆弾の数を入れる配列
                if(cntary[i][j] == '\u0000'){cntary[i][j] = '1';}
                else{
                  char tmp = cntary[i][j];
                  char num[] = Integer.toString((tmp-'0')+1).toCharArray();
                  cntary[i][j] = num[0];
                }
              }
            }
          }
        }

      }
    }

    for(int i = 0; i < h; i++){
      for(int j = 0; j < w; j++){
        System.out.print(cntary[i][j]);
      }
      System.out.println("");
    }

  }
}

/*
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
String blank = sc.nextLine();
String s = sc.nextLine();
System.out.println();
System.exit(0)
*/
