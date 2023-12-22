import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] nums = new int[n];
      
      int maxNum = -1;
      for(int i = 0; i < n; i++) {
        nums[i] = sc.nextInt();
        maxNum = Math.max(maxNum, nums[i]);
      }
      
      int halfNum = maxNum / 2;
      
      int maxIdx = -1;
      for(int i = 0; i < n; i++) {
        int a = nums[i];
        if(a == maxNum) continue;
        if(nums[i] > halfNum) {
          a = maxNum - nums[i];
        }
        if(maxIdx == -1 || a > nums[maxIdx])
          maxIdx = i;
      }
      System.out.println(maxNum + " " + nums[maxIdx]);
  }
}