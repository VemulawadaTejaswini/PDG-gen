import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    int x = 0;
    int l = 0;
    int[][] a = new int[h][w];
    for(int i=0; i<h; i++){
      String str = sc.next();
      for(int j=0; j<w; j++){
        char ch = str.charAt(j);
        if(ch=='#'){
        a[i][j] = 1;
        }
        else{
          a[i][j] = 0;
        }
        x = x*a[i][j];
        l += a[i][j];
      }
    }
    
    int[][] b = new int[h][w];
    b = a;
    
    int cnt = 0;      
    while(x==0 && l>0){
      x=1;
      for(int i=0; i<h; i++){
        for(int j=0; j<w; j++){
          if(a[i][j]==0){
            if(i==0){
              if(a[i+1][j]==1){
                b[i][j]=1;
              }
            }
            else if(i==h-1){
              if(a[i-1][j]==1){
                b[i][j]=1;
              }
            }
            else{
              if(a[i-1][j]==1 || a[i+1][j]==1){
                b[i][j]=1;
              }
            }
            if(j==0){
              if(a[i][j+1]==1){
                b[i][j]=1;
              }
            }
            else if(j==w-1){
              if(a[i][j-1]==1){
                b[i][j]=1;
              }
            }
            else{
              if(a[i][j-1]==1 || a[i][j+1]==1){
                b[i][j]=1;
              }
            }
          }
          x = x*b[i][j];
        }
      }
      cnt++;
    }
    System.out.println(cnt);
  }
}