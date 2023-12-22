import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];
      for(int i = 0; i < n; i++)
        arr[i] = sc.nextInt();

      long res = Long.MAX_VALUE;
      for(int idx = 1; idx < n - 2; idx++) {
            long[] leftMax = getMax(Arrays.copyOfRange(arr, 0, idx + 1));
            long[] rightMax = getMax(Arrays.copyOfRange(arr, idx + 1, n));
            
            long max = Math.max(leftMax[0], leftMax[1]);
            max = Math.max(max, Math.max(rightMax[0], rightMax[1]));

            long min = Math.min(leftMax[0], leftMax[1]);
            min = Math.min(min, Math.min(rightMax[0], rightMax[1]));
            
            res = Math.min(res, Math.abs(min - max));
      }
      System.out.println(res);
  }

  private static long[] getMax(int[] arr) {

      long[] leftSum = new long[arr.length];
      leftSum[0] = arr[0];
      for(int i = 1; i < arr.length; i++)
        leftSum[i] = leftSum[i - 1] + arr[i];

      long[] rightSum = new long[arr.length];
      rightSum[arr.length - 1] = arr[arr.length - 1];
      for(int i = arr.length - 2; i >=0; i--) {
        rightSum[i] = rightSum[i+1] + arr[i];
      }

      long minDiff = Math.abs(leftSum[0] - rightSum[1]);
      int minIdx = 0;
      for(int i = 1; i < arr.length - 1; i++) {
        long curDiff = Math.abs(leftSum[i] - rightSum[i + 1]);
        if(minDiff > curDiff) {
          minDiff = curDiff;
          minIdx = i;
        }
      }
      return new long[]{ leftSum[minIdx], rightSum[minIdx+1] };
  }
}