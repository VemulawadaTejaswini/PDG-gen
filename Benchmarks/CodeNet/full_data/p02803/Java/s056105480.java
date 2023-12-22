import java.util.*;

public class Main{
  
  static int[][] originalmap;
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
    
    originalmap = new int[h][w];
    
    for(int i=0;i<h;i++){
      String temp = sc.next();
      char[] ver = temp.toCharArray();
      for(int j=0;j<w;j++){
        if(ver[j]=='.'){
          originalmap[i][j]=100000;
        }else{
          originalmap[i][j]=-1;
        }
      }
    }
    
    int ans = 0;
    
    for(int i=0;i<h;i++){
      for(int j=0;j<w;j++){
        
        if(originalmap[i][j]!=-1){
          
          map = new int[h][w];
          for(int t=0;t<h;t++){
            
            map[t] = originalmap[t].clone();

          }
          

          
          map[i][j]=0;
          solve(i,j);

          for(int k=0;k<h;k++){
            for(int l=0;l<w;l++){
              
              if(map[k][l]!=100000)ans = Math.max(ans,map[k][l]);
            }
          }
          
        }
      }
    }
    
    System.out.println(ans);
    
    
  }
}
