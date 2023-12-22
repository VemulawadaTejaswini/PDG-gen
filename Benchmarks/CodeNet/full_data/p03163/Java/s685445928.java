import java.util.*;

class Main{
  public static int max2(int a,int b){
    return (a>b)?a:b;
  }
  
  public static long max2(long a,long b){
    return (a>b)?a:b;
  }
  
  public static int max3(int a,int b,int c){
    return (max2(a,b)<c)?c:max2(a,b);
  }
  
  public static int min2(int a,int b){
    return (a>b)?b:a;
  }
  
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int W=sc.nextInt();
    int[] w=new int[N];
    Long[] v=new Long[N];
    long[][] ans=new long[N][W+1];
    //ans[i][j]は0からi番目の荷物から、重さj以下になるように選んだときの最大価値
    
    for(int i=0;i<N;i++){
      w[i]=sc.nextInt();
      v[i]=sc.nextLong();
    }
      
    
    for(int i=0;i<W+1;i++){
      if(i<w[0]){
        ans[0][i]=0;
      }else{
        ans[0][i]=v[0];
      }
      
    }
    
    for(int i=1;i<N;i++){
      for(int j=0;j<W+1;j++){
        if(j<w[i]){
          ans[i][j]=ans[i-1][j];
        }else{
          ans[i][j]=max2(ans[i-1][j-w[i]]+v[i],ans[i-1][j]);
        }
      }
    }
    
    System.out.print(ans[N-1][W]);
    
  }
}