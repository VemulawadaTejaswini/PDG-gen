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
    
    int cntEnemy = 0;
    int remX, remY;
    for(int i=1; i<N+1; i++){
      B[i-1] = sc.nextInt();
      // (i-1)街の残りの敵
      remX = A[i] - B[i-1];
      /// 倒しきった場合
      if (remX <= 0){
      	cntEnemy += A[i];
        // i街の残りの敵
        remY = A[i-1] + remX;
        /// 倒しきった場合
        if (remY <= 0){
          cntEnemy += A[i-1];
          A[i] = 0;
        /// 倒しきれなかった場合
        } else {
          cntEnemy += (-remX);
          A[i-1] = remY;
        }
      /// 倒しきれなかった場合
      } else {
      	cntEnemy += B[i-1];
      }
    }
    
    System.out.println(cntEnemy);
		
  }
}