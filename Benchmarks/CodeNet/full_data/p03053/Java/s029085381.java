import java.util.*;

class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int h = Integer.parseInt(sc.next());
    int w = Integer.parseInt(sc.next());
    char[][] map = new char[h][w];
    int[][] dist = new int[h][w];
    Queue<Pair> queue = new ArrayDeque<>();
    for(int i=0;i<h;i++){
      map[i] = sc.next().toCharArray();
      for(int j=0;j<w;j++){
        dist[i][j] = -1;
        if(map[i][j] == '#'){
          dist[i][j] = 0;
          queue.add(new Pair(i,j));
        }
      }
    }
    int[][] vec = {{1,0},{-1,0},{0,1},{0,-1}};
    int ans = 0,size,yto,xto;
    Pair p;
    while(!queue.isEmpty()){
      ans++;
      size = queue.size();
      for(int i=0;i<size;i++){
        p = queue.poll();
        for(int j=0;j<4;j++){
          yto = p.y + vec[j][0];
          xto = p.x + vec[j][1];
          if(yto>=0 && yto<h && xto>=0 && xto <w && dist[yto][xto]==-1 &&
             map[yto][xto] == '.'){
            dist[yto][xto] = ans;
            queue.add(new Pair(yto,xto));
          }
        }
      }
    }
    System.out.println(ans-1);
    
  }
}
class Pair{
  int x;
  int y;
  public Pair(int y,int x){
    this.x = x;
    this.y = y;
  }
}