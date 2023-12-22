import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[][] a=new int[101][101];
    int x1=sc.nextInt();
    int y1=sc.nextInt();
    int hi=sc.nextInt();
    for(int i=0;i<101;i++){
      for(int j=0;j<101;j++){
        a[i][j]=manh(x1,y1,j,i)+hi;
        a[i][j]=(a[i][j]<0?-1:a[i][j]);
      }
    }
    for(int dat=1;dat<n;dat++){
      x1=sc.nextInt();
      y1=sc.nextInt();
      hi=sc.nextInt();
      for(int i=0;i<101;i++){
        for(int j=0;j<101;j++){
          if(a[i][j]!=-1){
            if(manh(x1,y1,j,i)+hi==a[i][j]){
              
            }else{
              a[i][j]=-1;
            }
          }
        }
      }
    }
    for(int i=0;i<101;i++){
      for(int j=0;j<101;j++){
        if(a[i][j]!=-1){
          System.out.println(j+" "+i+" "+a[i][j]);
          //return;
        }
      }
    }
  }
  static int manh(int x1,int y1,int x2,int y2){
    return Math.abs(x1-x2)+Math.abs(y1-y2);
  }
}