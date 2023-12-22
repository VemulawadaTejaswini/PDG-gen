import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static int N;
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int[] A = new int[N + 10];
    int[] B = new int[N + 10];
    int[] C = new int[N + 10];
    long ans = 0;

    for (int i = 0; i < N; i++){
      A[i] = scanner.nextInt();
    }
    for (int i = 0; i < N; i++){
      B[i] = scanner.nextInt();
    }
    for (int i = 0; i < N; i++){
      C[i] = scanner.nextInt();
    }
    Arrays.sort(A);
    Arrays.sort(C);
    for (int j = 0; j < N; j++){
      ans += binary_search(A, B[j]) * (N - binary_search(C, B[j] + 1));
    }
    System.out.println(ans);
  }
  public static long binary_search(int[] arrays, int target){
    int left = 0;
    int right = N;
    while (right > left){
      int mid = (right + left) / 2;
      if (arrays[mid] >= target){
        right = mid;
      } else {
        left = mid + 1;
      }
    }
    return left;
  }
}
