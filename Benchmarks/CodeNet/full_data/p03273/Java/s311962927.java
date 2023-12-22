import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    int A[][] = new int[H][W];
    for(int i=0;i<H;i++){
      String s = sc.next();
      for(int j=0;j<W;j++){
        if(s.charAt(j) == '.'){
          A[i][j] = 0;
        }else{
          A[i][j] = 1;
        }
      }
    }
    for(int i=0;i<H;i++){
      int tmp = 0;
      for(int j=0;j<W;j++){
        tmp += A[i][j];
      }
      if(tmp == 0){
        for(int k=i;k<H-1;k++){
          for(int j=0;j<W;j++){
            A[k][j] = A[k+1][j];
          }
        }
        H--;
        i--;
      }
    }
    for(int j=0;j<W;j++){
      int tmp = 0;
      for(int i=0;j<H;i++){
        tmp += A[i][j];
      }
      if(tmp == 0){
        for(int k=j;k<W-1;j++){
          for(int i=0;i<H;i++){
            A[i][k] = A[i][k+1];
          }
        }
        W--;
        j--;
      }
    }
    for(int i=0;i<H;i++){
      for(int j=0;j<W;j++){
        if(A[i][j] == 0){
          System.out.println(".");
        }else{
          System.out.println("#");
        }
      }
      System.out.print("\n");
    }
  }
}
