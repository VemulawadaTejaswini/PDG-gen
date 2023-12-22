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

    for (int i=0; i<N; i++){
      B[i] = sc.nextInt();
    }

    int cnt = 0;
    for(int i=0; i<N; i++){
      int remE1 = A[i] - B[i];

      if (remE1<= 0){
      	cnt += A[i];
        int remE2 = A[i+1] + remE1;
        int B_ = -remE1;

        if (remE2 <= 0){
          cnt += A[i+1];
          A[i] = 0;
        } else {
          cnt += B_;
          A[i+1] = remE2;
        }
      } else {
      	cnt += B[i-1];
      }
    }
    
    System.out.println(cnt);
		
  }
}