import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    char[][] map = new char[h][w];
    int sum = 0;
    for(int i=0;i<h;i++){
      map[i] = sc.next().toCharArray();
      for(int j=0;j<w;j++){
        if(map[i][j]=='#'){
          sum++;
        }
      }
    }
    int[][] isVisited = new int[h][w];
    Queue<int[]> queue = new ArrayDeque<>();
    queue.add(new int[]{0,0});
    isVisited[0][0] = 1;
    int[] p;
    int[][] vec = {{1,0},{0,1}};
    int tox,toy;
    while(queue.size()>0){
      p = queue.poll();
      for(int i=0;i<2;i++){
        toy = p[0] + vec[i][0];
        tox = p[1] + vec[i][1];
        if(toy < h && tox < w && isVisited[toy][tox] == 0 && map[toy][tox]=='#'){
          isVisited[toy][tox] = isVisited[p[0]][p[1]]+1;
          queue.add(new int[]{toy,tox});
        }
      }
    }
    if(isVisited[h-1][w-1]==sum){
      System.out.println("Possible");
    }else{
      System.out.println("Impossible");
    }
    
  }
}