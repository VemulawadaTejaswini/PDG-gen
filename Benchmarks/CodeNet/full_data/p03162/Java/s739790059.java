import java.util.*;

class Main{
  public static int max2(int a,int b){
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
    int[] A=new int[N];
    int[] B=new int[N];
    int[] C=new int[N];
    int[][] Ans=new int[3][N];
    
    for(int i=0;i<N;i++){
      A[i]=sc.nextInt();
      B[i]=sc.nextInt();
      C[i]=sc.nextInt();
    }
    
    Ans[0][0]=A[0];
    Ans[1][0]=B[0];
    Ans[2][0]=C[0];
    
    for(int i=1;i<N;i++){
      Ans[0][i]=max2(Ans[1][i-1]+A[i],Ans[2][i-1]+A[i]);
      Ans[1][i]=max2(Ans[0][i-1]+B[i],Ans[2][i-1]+B[i]);
      Ans[2][i]=max2(Ans[0][i-1]+C[i],Ans[1][i-1]+C[i]);
    }
    
    System.out.print(max3(Ans[0][N-1],Ans[1][N-1],Ans[2][N-1]));
    
  }
}