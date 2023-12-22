import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // 整数の入力
    int N = sc.nextInt();
    long[] A = new long[N];
    long[] B = new long[N];
    int count = 0;
    for(int i = 0; i < N; i++){
       A[i] = sc.nextInt();
       B[i] = sc.nextInt();
    }

    int temp_dif;
    for(int i = N - 1; i >= 0; i--){
      if( A[i] % B[i] != 0){

        temp_dif = (int) (B[i] * ((A[i] / B[i]) + 1) - A[i]);

        count += temp_dif;

        for(int j = 0; j <= i; j++){
          A[j] += temp_dif;
        }
      }
    }


    System.out.println(count);
  }
}