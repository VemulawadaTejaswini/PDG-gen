import java.util.*;
 
public class Main {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int K = sc.nextInt();
      
      int P[] = new int[N];
        
      for (int i = 0; i < N; i++) {
        P[i] = sc.nextInt();
      }
      
      int same_count = 0;
      int motionless_count = 0;
      boolean order = true;
      
      for (int i = 0; i < N - K + 1; i++) {
        order = true;
        
        if (i == N - K) {
          for (int j = 0; j < K - 1; j++) {
            if (P[i + j] > P[i + j + 1]) {
              break;
            }
            if (j == K - 2) {           
              motionless_count += 1;
            }
          }
          break;
        }
        
        for (int j = 0; j < K; j++) {
          if (order && j < K - 1 && P[i + j] > P[i + j + 1]) {
            order = false;
          }
          if (order && j == K - 2) {
            motionless_count += 1;
          }
          
          if (P[i] > P[i + j + 1]) {
            break;
          }
          if (P[i + K] < P[i + j + 1]) {
            break;
          }
          if (!order && j == K) {
            same_count += 1;
          }       
        }
      }
      if (motionless_count > 1) {
        motionless_count -= 1;
      } else {
        motionless_count = 0;
      }
      System.out.print(N - K + 1 - same_count - motionless_count);
    }
}
