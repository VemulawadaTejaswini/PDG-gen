import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int y = scan.nextInt();
    int x = scan.nextInt();
    int[] ignorey = new int[y];
    int[] ignorex = new int[x];
    char[][] board = new char[y][x];
    String a = "takagi";
    for(int i = 0; i < y;i++){
      a = scan.next();
      for(int j = 0;j<x;j++){
        board[i][j] = a.charAt(j);
      }
    }

    for(int i = 0;i < y ;i++){
      for(int j = 0;j<x;j++){
        if(!(board[i][j] == '.')){
          break;
        }
        if(j == x-1){
          ignorey[i] = 1;
        }
      }
    }
    for(int i = 0;i < x ;i++){
      for(int j = 0;j<y;j++){
        if(!(board[j][i] == '.')){
          break;
        }
        if(j == y-1){
          ignorex[i] = 1;
        }
      }
    }
    for (int i = 0;i < y;i++) {
      if(ignorey[i] == 1){
        continue;
      }
      for (int j = 0;j < x ;j++) {
        if(ignorex[j] == 1){
          continue;
        }
        System.out.print(board[i][j]);
      }
      System.out.println();
    }
  }
}
