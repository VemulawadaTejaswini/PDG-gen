import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];
      for(int i = 0; i < n; i++)
        arr[i] = sc.nextInt();

      long[] leftSum = new long[arr.length];
      leftSum[0] = arr[0];
      for(int i = 1; i < arr.length; i++)
        leftSum[i] = leftSum[i - 1] + arr[i];
 
      long[] rightSum = new long[arr.length];
      rightSum[arr.length - 1] = arr[arr.length - 1];
      for(int i = arr.length - 2; i >=0; i--) {
        rightSum[i] = rightSum[i+1] + arr[i];
      }

      long res = Long.MAX_VALUE;
      for(int idx = 1; idx < n - 2; idx++) {
            long[] leftMax = getLeft(arr, leftSum, idx);
            long[] rightMax = getRight(arr, rightSum, idx + 1);
            
            long max = Math.max(leftMax[0], leftMax[1]);
            max = Math.max(max, Math.max(rightMax[0], rightMax[1]));

            long min = Math.min(leftMax[0], leftMax[1]);
            min = Math.min(min, Math.min(rightMax[0], rightMax[1]));
           
            res = Math.min(res, Math.abs(min - max));
      }
      System.out.println(res);
  }

  private static long[] getLeft(int[] arr, long[] leftSum, int idx) {
      long minDiff = Math.abs(leftSum[0] - (leftSum[idx] - leftSum[0]));
      int minIdx = 0;
      for(int i = 1; i < idx; i++) {
        long curDiff = Math.abs(leftSum[i] - (leftSum[idx] - leftSum[i]));
        if(minDiff > curDiff) {
          minDiff = curDiff;
          minIdx = i;
        }
      }
      return new long[]{ leftSum[minIdx], leftSum[idx] - leftSum[minIdx] };
  }

  private static long[] getRight(int[] arr, long[] rightSum, int idx) {
      long minDiff = Math.abs(rightSum[arr.length - 1] - (rightSum[idx] - rightSum[arr.length - 1]));
      int minIdx = arr.length - 1;
      for(int i = arr.length - 2; i > idx; i--) {
        long curDiff = Math.abs(rightSum[i] - (rightSum[idx] - rightSum[i]));
        if(minDiff > curDiff) {
          minDiff = curDiff;
          minIdx = i;
        }
      }
      return new long[]{ rightSum[minIdx], rightSum[idx] - rightSum[minIdx] };
  }

}
