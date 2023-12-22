import java.util.*;

class Main{
  static int DAME=2000000000;
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[][] a=new int[101][101];
    /*
    [i][j] == a[i][j]              : a[i][j]> 0
    [i][j] <= -a[i][j] : a[i][j]<=0
    */
    int x1=sc.nextInt();
    int y1=sc.nextInt();
    int hi=sc.nextInt();
    for(int i=0;i<101;i++){
      for(int j=0;j<101;j++){
        if(hi==0){
          a[i][j]=-manh(x1,y1,j,i);
        }else{
          a[i][j]=manh(x1,y1,j,i)+hi;
        }
      }
    }
    for(int dat=1;dat<n;dat++){
      x1=sc.nextInt();
      y1=sc.nextInt();
      hi=sc.nextInt();
      for(int i=0;i<101;i++){
        for(int j=0;j<101;j++){
          if(a[i][j]!=DAME){
/////////////////////////////////////////////
            if(hi==0){
              if(a[i][j]>=0){
                /////////////////////////////{
                if(manh(x1,y1,j,i)<a[i][j]){
                  a[i][j]=DAME;
                }
                /////////////////////////////}
              }else{
                /////////////////////////////{
                a[i][j]=Math.max(-manh(x1,y1,j,i),a[i][j]);
                /////////////////////////////}
              }
            }else{
              if(a[i][j]>=0){
                /////////////////////////////{
                if(a[i][j]!=manh(x1,y1,j,i)+hi){
                  a[i][j]=DAME;
                }
                /////////////////////////////}
              }else{
                /////////////////////////////{
                if(manh(x1,y1,j,i)+hi<=-a[i][j]){
                  a[i][j]=DAME;
                }else{
                  a[i][j]=manh(x1,y1,j,i)+hi;
                }
                /////////////////////////////}
              }
            }
/////////////////////////////////////////////
          }
        }
      }
    }
    for(int i=0;i<101;i++){
      for(int j=0;j<101;j++){
        if(a[i][j]!=DAME){
          System.out.println(j+" "+i+" "+a[i][j]);
        }
      }
    }
  }
  static int manh(int x1,int y1,int x2,int y2){
    return Math.abs(x1-x2)+Math.abs(y1-y2);
  }
}
