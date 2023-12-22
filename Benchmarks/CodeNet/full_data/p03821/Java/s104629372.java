import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // 整数の入力
    int N = sc.nextInt();
    int[] A = new int[N];
    int[] B = new int[N];
    int[] C = new int[N];
    int count = 0;
    for(int i = 0; i < N; i++){
       A[i] = sc.nextInt();
       B[i] = sc.nextInt();
    }

    for(int i = N - 1; i >= 0; i--){
      while( A[i] % B[i] != 0){
        for(int j = 0; j <= i; j++){
          A[j]++;
        }
        count++;
      }
    }


    System.out.println(count);
  }
}