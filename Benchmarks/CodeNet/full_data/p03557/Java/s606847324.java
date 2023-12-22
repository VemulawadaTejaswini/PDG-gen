import java.util.*;
 
public class Main { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    int[] B = new int[N];
    int[] C = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    for (int i = 0; i < N; i++) {
      B[i] = sc.nextInt();
    }
    for (int i = 0; i < N; i++) {
      C[i] = sc.nextInt();
    }
    Arrays.sort(A);
    Arrays.sort(B);
    Arrays.sort(C);

    int[] sum = new int[N];
    for (int i = 0; i < N; i++) {
      sum[i] = N - upperBound(C, B[i]);
    }
    // System.out.println(Arrays.toString(sum));

    int ans = 0;
    int j = N - 1;
    int now = 0;
    for (int i = N - 1; 0 <= i; i--) {
      while (0 <= j && A[i] < B[j]) {
        now += sum[j--];
      }
      ans += now;
    }

    System.out.println(ans);
  }

  //指定した値以上の先頭のインデックスを返す
  private static final int lowerBound(final int[] arr, final int value) {
    int low = 0;
    int high = arr.length;
    int mid;
    while (low < high) {
      mid = ((high - low) >>> 1) + low;   //(low+high)/2のオーバーフロー対策
      if (arr[mid] < value) {
        low = mid + 1;
      } else {
        high = mid;
      }
    }
    return low;
  }
 
  //指定した値より大きい先頭のインデックスを返す
  private static final int upperBound(final int[] arr, final int value) {
    int low = 0;
    int high = arr.length;
    int mid;
    while (low < high) {
      mid = ((high - low) >>> 1) + low;   //(low+high)/2のオーバーフロー対策
      if (arr[mid] <= value) {
        low = mid + 1;
      } else {
        high = mid;
      }
    }
    return low;
  }
}