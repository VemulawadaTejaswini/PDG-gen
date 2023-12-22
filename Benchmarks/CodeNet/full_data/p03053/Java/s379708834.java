import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int h = sc.nextInt();
    int w = sc.nextInt();

    char[][] c_array = new char[h][w];


    for(int i=0; i<h; i++){
      c_array[i] = sc.next().toCharArray();
    }



    int ans = solve(c_array);
    System.out.println(ans);

  }

  public static int solve(char[][] c){
    int ret = 0;
    int h = c.length;
    int w = c[0].length;

    Deque<Position> p = new ArrayDeque<>();

    for(int i=0; i<h; i++){
      for(int j=0; j<w; j++){
        if(c[i][j]=='#'){
          p.add(new Position(i,j,0));
        }
      }
    }


    while(p.size()>0){
      Position xy = p.poll();
      int x = xy.x;
      int y = xy.y;
      int depth = xy.d;

      if(depth>ret){
        ret = depth;
      }

      if(x+1<w && c[y][x+1]=='.'){
        c[y][x+1] = '#';
        p.add(new Position(y,x+1,depth+1));
      }
      if(x-1>=0 && c[y][x-1]=='.'){
        c[y][x-1] = '#';
        p.add(new Position(y,x-1,depth+1));
      }
      if(y+1<h && c[y+1][x]=='.'){
        c[y+1][x] = '#';
        p.add(new Position(y+1,x,depth+1));
      }
      if(y-1>=0 && c[y-1][x]=='.'){
        c[y-1][x] = '#';
        p.add(new Position(y-1,x,depth+1));
      }




    }



    return ret;
  }
}

class Position{
  Position(int y , int x, int d){
    this.x = x; this.y = y; this.d = d;
  }


  int x;
  int y;
  int d;
}