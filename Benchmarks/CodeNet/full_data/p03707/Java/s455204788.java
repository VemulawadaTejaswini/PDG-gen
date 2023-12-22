import java.util.*;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(); //height
    int M = sc.nextInt(); //width
    int Q = sc.nextInt(); sc.nextLine();//query

    char[][] grid = new char[N][M];
    for(int i = 0; i < N; i++) {
      String line = sc.nextLine();
      grid[i] = line.toCharArray();
    }

    for(int i = 0; i < Q; i++) {
      int sx = sc.nextInt(); int sy = sc.nextInt();
      int tx = sc.nextInt(); int ty = sc.nextInt(); sc.nextLine();

      int count = 0;
      int dis_count = 0;
      int[][] check = new int[tx-sx+1][ty-sy+1];

      for(int a = sx-1; a < tx; a++) {
        for(int b = sy-1; b < ty; b++) {
          int X = a-sx+1;
          int Y = b-sy+1;

          int tmp;
          if(grid[a][b] == '1') {
            if(check[X][Y] == 0) {
              count++;
              tmp = count;
              check[X][Y] = tmp;
            } else {
              tmp = check[X][Y];
            }

            if(a != tx-1) { if(grid[a+1][b] == '1') {
              check[X+1][Y] = tmp;
            }}
            if(b != ty-1) { if(grid[a][b+1] == '1') {
              if(check[X][Y+1] != 0 && check[X][Y+1] != tmp) {
                dis_count++;
              }
              check[X][Y+1] = tmp;
            }}
          }
        }
      }
      System.out.println(count - dis_count);
    }
  }
}
