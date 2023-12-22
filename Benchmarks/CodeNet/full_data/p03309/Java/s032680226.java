import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];
      int max = -1;
      for(int i = 0; i < n; i++) {
        arr[i] = sc.nextInt() - i - 1;
        max = Math.max(max, arr[i] + i + 1);
      }
      int left = -1 * max;
      int right = max;

      while(left < right) {
        int mid1 = left + (right - left) / 3;
        int mid2 = right - (right - left) / 3;
        long leftRes = cal(arr, mid1);
        long rightRes = cal(arr, mid2);
        if(leftRes < rightRes)
          right = mid2 - 1;
        else if (leftRes > rightRes)
          left = mid1 + 1;
        else {
          left = mid1 + 1;
          right = mid2;
        }
      }
      
      System.out.println(cal(arr, left));
  }

  private static long cal(int[] arr, int b) {
    long sum = 0;
    for(int a : arr) {
      sum += Math.abs(a - b);
    }
    return sum;
  }
}