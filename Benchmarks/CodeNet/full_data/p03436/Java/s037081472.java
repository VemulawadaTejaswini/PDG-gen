import java.util.*;

class Main{
  static int[] dy={-1,0,0,1};
  static int[] dx={0,-1,1,0};
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int h=sc.nextInt();
    int w=sc.nextInt();
    int walls=0;
    String[] a=new String[h];
    for(int i=0;i<h;i++){
      a[i]=sc.next();
      for(int j=0;j<w;j++){
        if(a[i].charAt(j)=='#'){
          walls++;
        }
      }
    }
    boolean[][] vid=new boolean[h][w];
    Deque<C> dq=new ArrayDeque<>();
    vid[0][0]=true;
    dq.addLast(new C(0,0,1));
    int dist=-1;
    while(!dq.isEmpty()){
      C he=dq.pollFirst();
      if(he.x==w-1&&he.y==h-1){
        dist=he.d;
        break;
      }
      for(int i=0;i<4;i++){
        if(he.x+dx[i]<0||w<=he.x+dx[i]||he.y+dy[i]<0||h<=he.y+dy[i]){
          continue;
        }
        int nx=he.x+dx[i];
        int ny=he.y+dy[i];
        if(!vid[ny][nx]&&a[ny].charAt(nx)=='.'){
          dq.addLast(new C(nx,ny,he.d+1));
          vid[ny][nx]=true;
        }
      }
    }
    if(dist==-1){
      System.out.println(-1);
    }else{
      System.out.println(h*w-dist-walls);
    }
  }
  static class C{
    int x,y,d;
    C(int x,int y,int d){
      this.x=x;
      this.y=y;
      this.d=d;
    }
  }
}