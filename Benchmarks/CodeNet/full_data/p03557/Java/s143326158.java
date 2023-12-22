import java.util.*;

public class Main {
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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int[] arr = {1,2,3,4,5,6,7,8,9};
    System.out.println(lowerBound(arr, 4));
  }
}