import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];

      int maxNum = -1;
      int minNum = Integer.MAX_VALUE;
      for(int i = 0; i < n; i++) {
        int num = sc.nextInt();
        arr[i] = num;
        maxNum = Math.max(maxNum, num);
        minNum = Math.min(minNum, num);
      }
      int half = maxNum / 2;
      int res = minNum;
      for(int num : arr) {
        if(num == maxNum) continue;
        if(Math.abs(num - half) < Math.abs(res - half))
          res = num;
      }
      System.out.println(maxNum + " " + res);
  }
}