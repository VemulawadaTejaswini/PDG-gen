import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A[][] = new int[2][N];
    
    for(int i=0; i<2; i++){
      for(int j=0; j<N; j++){
        A[i][j] = sc.nextInt();
      }
    }
    
    int max = 0;
    
    for(int i=0; i<N; i++){
      int temp = 0;
      for(int j=0; j<=i; j++){
        temp += A[0][j];
      }
      for(int j=i; j<N; j++){
        temp += A[1][j];
      }
      if(temp > max){
        max = temp;
      }
    }
    System.out.println(max);
  }
}