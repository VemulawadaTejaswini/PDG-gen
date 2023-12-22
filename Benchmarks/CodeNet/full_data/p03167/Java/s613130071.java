import java.util.*;

class Main{
  public static void main(String[] args){
    int dx[] = { 1, 0};
    int dy[] = { 0, 1};
    Scanner sc = new Scanner(System.in);
    int h=sc.nextInt();
    int w=sc.nextInt();
    StringBuilder[] a = new StringBuilder[h];
    for(int i=0;i<h;i++){
      a[i]=new StringBuilder(sc.next());
    }
    int[][] dp = new int[h][w];
    dp[0][0] = 1;
    Deque<Xy> dq = new ArrayDeque<>();
    dq.addLast(new Xy(0,0));
    while(!dq.isEmpty()){
      Xy p = dq.pollFirst();
      if(a[p.y].charAt(p.x)=='#'){continue;}
      a[p.y].setCharAt(p.x,'#');
      for(int i=0;i<2;i++){
        if(0<=p.x+dx[i]&&p.x+dx[i]<w&&0<=p.y+dy[i]&&p.y+dy[i]<h&&a[p.y+dy[i]].charAt(p.x+dx[i])=='.'){
          dp[p.y+dy[i]][p.x+dx[i]]=(dp[p.y+dy[i]][p.x+dx[i]]+dp[p.y][p.x])%1000000007;
          dq.addLast(new Xy(p.x+dx[i],p.y+dy[i]));
        }
      }
    }
    System.out.println(dp[h-1][w-1]);
  }
  static class Xy{
    int x;
    int y;
    Xy(int x,int y){
      this.x=x;
      this.y=y;
    }
  }
}