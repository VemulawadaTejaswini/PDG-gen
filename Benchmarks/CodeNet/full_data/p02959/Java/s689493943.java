import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N+1];	// i町の敵の数
    int[] B = new int[N];	// 各勇者の倒せる敵の数
    
    for(int i=0; i<N+1; i++){
      A[i] = sc.nextInt();
    }
    
    for(int i=0; i<N; i++){
      B[i] = sc.nextInt();
    }

    int cntEnemy = 0;
    for(int i=0; i<N; i++){
      int remX = A[i] - B[i];
      if (remX <= 0){
      	cntEnemy += A[i];
        int remY = A[i+1] - (B[i] - A[i]);
        if (remY <= 0){
          cntEnemy += A[i-1];
          A[i] = 0;
        } else {
          cntEnemy += A[i+1] - (B[i] - A[i]);
          A[i+1] = remY;
        }
      /// 倒しきれなかった場合
      } else {
      	cntEnemy += B[i];
      }
    }
    
    System.out.println(cntEnemy);
		
  }
}