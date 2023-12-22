import java.util.*;

public class Main{
  
  static int[][] map;
  static int h,w;
  
  static void solve(int i,int j){
    if(i>0&&map[i-1][j]!=-1&&map[i-1][j]>map[i][j]+1){
      map[i-1][j]=map[i][j]+1;
      solve(i-1,j);
    }
    if(i<h-1&&map[i+1][j]!=-1&&map[i+1][j]>map[i][j]+1){
      map[i+1][j]=map[i][j]+1;
      solve(i+1,j);
    }
    if(j>0&&map[i][j-1]!=-1&&map[i][j-1]>map[i][j]+1){
      map[i][j-1]=map[i][j]+1;
      solve(i,j-1);
    }
    if(j<w-1&&map[i][j+1]!=-1&&map[i][j+1]>map[i][j]+1){
      map[i][j+1]=map[i][j]+1;
      solve(i,j+1);
    }
    
  }
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    h = sc.nextInt();
    w=sc.nextInt();
    map = new int[h][w];
    
    for(int i=0;i<h;i++){
      String temp = sc.next();
      char[] ver = temp.toCharArray();
      for(int j=0;j<w;j++){
        if(ver[j]=='.'){
          map[i][j]=100000;
        }else{
          map[i][j]=-1;
        }
      }
    }
    
    map[h-1][0] = 0;
    solve(h-1,0);
    
    System.out.println(map[0][w-1]);
    
    
  }
}
