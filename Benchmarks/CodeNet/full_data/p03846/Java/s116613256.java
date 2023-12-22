import java.util.Scanner;
import java.util.Arrays;
public class Main{
  public static void main(String[]  args){
    Scanner S = new Scanner(System.in);
    int N = S.nextInt();
    int A[] = new int[N];
    for ( int i = 0;i < N;i++){
      A[i] = S.nextInt();
    }
    int[] B = A;
    int wrong = 0;
    Arrays.sort(B);
    if( N % 2 == 1){
      for(int i = 0;i<(N-1)/2;i++){
        if(i == 0){
          if (B[i] != 0){
            wrong = 1;
          }
        }
        if(i != 0){
          if (B[2 * i -1] != 2 * i){
            wrong = 1;
          }
          if (B[2 * i] != 2 * i){
            wrong = 1;
          }
        } 
      }
      if (wrong ==0){
        int c = 1;
        for(int i=0;i<(N-1)/2;i++){
          c *= 2;
        }
        c %= 1000000007;
        System.out.println(c);
      }
      if (wrong != 0){
        System.out.println("0");
      }
    }
    if (N%2 == 0){
      for(int i = 0;i<N/2;i++){
        if (B[2 * i ]  != 2 * i + 1){
          wrong = 1;
        }
        if (B[2 * i +1] != 2 * i + 1){
          wrong = 1;
        }
      }
      if (wrong ==0){
        int c = 1;
        for(int i=0;i<N/2;i++){
          c *= 2;
        }
        c %= 1000000007;
        System.out.println(c);
      }
      if (wrong != 0){
        System.out.println("0");
      }
    }
  }
}