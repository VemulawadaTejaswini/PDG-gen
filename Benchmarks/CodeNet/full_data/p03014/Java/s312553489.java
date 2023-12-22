import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    String[] a = new String[h];
    int[][] y = new int[h][w];
    int[][] t = new int[h][w];
    for(int i=0;i<h;i++){
      a[i] = sc.next();
    }
    
    for(int i=0;i<h;i++){
      y[i][0]=( a[i].charAt(0)=='.' ? 1 : 0 );
      for(int j=1;j<w;j++){
        y[i][j]=( a[i].charAt(j)=='.' ? y[i][j-1]+1 : 0 );
      }
      for(int j=w-1-1;j>=0;j--){
        y[i][j]=( y[i][j]==0 ? 0 : Math.max(y[i][j+1],y[i][j]) );
      }
    }
    
    for(int i=0;i<w;i++){
      t[0][i]=( a[0].charAt(i)=='.' ? 1 : 0 );
      for(int j=1;j<h;j++){
        t[j][i]=( a[j].charAt(i)=='.' ? t[j-1][i]+1 : 0 );
      }
      for(int j=h-1-1;j>=0;j--){
        t[j][i]=( y[j][i]==0 ? 0 : Math.max(t[j+1][i],t[j][i]) );
      }
    }
    
    int max=0;
    for(int i=0;i<h;i++){
      for(int j=0;j<w;j++){
        max=Math.max(y[i][j]+t[i][j],max);
      }
    }
    System.out.println(max-1);
  }
}
