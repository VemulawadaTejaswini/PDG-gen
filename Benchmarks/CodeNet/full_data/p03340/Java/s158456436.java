import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    long[] A = new long[N];
    long[] sum = new long[N];
    long[] xor = new long[N];
    int count = 0;
    for (int i = 0; i < N; i++){
      A[i] = scanner.nextLong();
    }
    for (int i = 0; i < N; i++){
      sum[i] = A[i];
      xor[i] = A[i];
    }
    for (int i = 1; i < N; i++){
      sum[i] += sum[i - 1];
      xor[i] ^= xor[i - 1];
    }
    for (int l = 0; l < N; l++){
      int left = l;
      int right = N;
      while (right - left > 1){
        int mid = (left + right) / 2;
        if (xor[mid] - xor[l] == sum[mid] - sum[l]){
          left = mid;
        } else {
          right = mid;
        }
      }
      count += left - l + 1;
    }
    System.out.println(count);
  }
}
