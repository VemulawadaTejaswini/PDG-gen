import java.util.Scanner;
import java.util.Arrays; 

public class Main { 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    int[] B = new int[N];
    int[] C = new int[N];
    for (int i =0; i<N; i++) A[i] = sc.nextInt();
    for (int i =0; i<N; i++) B[i] = sc.nextInt();
    for (int i =0; i<N; i++) C[i] = sc.nextInt();
    Arrays.sort(A);Arrays.sort(B);Arrays.sort(C);
    
    long[] comBC = new long[N];
    for(int i = 0 , j = 0; i < N; i++){
      while(j >=0 && C[j] <= B[i]){
        j++;
      }			
      comBC[i] = N - j;
    }		
    for(int i = N-1; i > 0; i--){
      comBC[i - 1] += comBC[i];
    }

    long ans = 0;
    for(int i = 0, j = 0; i <N; i++){
      while(j < N && B[j] <= A[i]){
        j++;
      }
      if(j < N){
        ans += comBC[j];
      }
    }		
    System.out.println(ans);
  }
}