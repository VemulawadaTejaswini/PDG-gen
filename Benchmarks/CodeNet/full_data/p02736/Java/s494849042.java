import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int a[] = new int[N];
    String S = sc.next();
    for(int i=0;i<N;i++){
      a[i] = Integer.parseInt(S.substring(i,i+1));
    }
//    int x[][] = new int[N][N];
//    for(int i=0;i<N;i++){
//      x[0][i]=a[i];
//    }
//    for(int i=1;i<N;i++){
//      for(int j=0;j<N-i;j++){
//        x[i][j]=Math.abs(x[i-1][j]-x[i-1][j+1]);
//      }
//    }
    System.out.println(Math.abs(a[0]-a[N-1]));
//    for(int i=0;i<N;i++){
//      for(int j=0;j<N;j++){
//        System.out.print(x[i][j]);
//      }
//      System.out.println("");
//    }
//    System.out.println(x[N-1][0]);
      
    
  }
  

  
}
