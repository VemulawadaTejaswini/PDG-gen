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
  
  public static long min2(long a,long b){
    return (a>b)?b:a;
  }
  
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int W=sc.nextInt();
    Long[] w=new Long[N];
    int[] v=new int[N];
    Long MAX=10000000000000L;
    int vsum=0;
    int answer=0;
    
    for(int i=0;i<N;i++){
      w[i]=sc.nextLong();
      v[i]=sc.nextInt();
      vsum+=v[i];
    }
      
    Long[][] ans=new Long[N][vsum+1];
    //ans[i][j]は0からi番目の荷物から、価値がj以上になるように選んだときの重さの最小値
    for(int i=0;i<N;i++){
      ans[i][0]=0L;
    }
    
    for(int j=1;j<vsum+1;j++){
      if(j<=v[0]){
        ans[0][j]=w[0];
        if(ans[0][j]<=W&&j>answer) answer=j;
      }else{
        ans[0][j]=MAX;
      }
    }
    
    for(int i=1;i<N;i++){
      for(int j=0;j<vsum+1;j++){
        if(j>=v[i]){
          ans[i][j]=min2(ans[i-1][j],ans[i-1][j-v[i]]+w[i]);
          if(ans[i][j]<=W&&j>answer) answer=j;
        }else{
          ans[i][j]=min2(ans[i-1][j],ans[i][0]+w[i]);
          if(ans[i][j]<=W&&j>answer) answer=j;
        }
      }
    }
    
    System.out.print(answer);
    
  }
}