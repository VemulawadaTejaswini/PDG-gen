import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[][] arr = new int[n][2];

      int sumA = 0;
      for(int i = 0; i < n; i++) {
        arr[i][0] = sc.nextInt();
        sumA += arr[i][0];
      }

      int sumB = 0;
      for(int i = 0; i < n; i++) {
        arr[i][1] = sc.nextInt();
        sumB += arr[i][1];
      }

      if(sumA < sumB) {
        System.out.println(-1);
        return;
      }
      
      int[] diff = new int[n];
      for(int i = 0; i < n; i++)
        diff[i] = arr[i][0] - arr[i][1];
      Arrays.sort(diff);
    
      int cnt = 0;
      long diffSum = 0;
      for(int i = 0; i < n; i++) {
        if(diff[i] < 0) {
            cnt++;
            diffSum += Math.abs(diff[i]);
        } else
            break;
      }
      
      for(int i = n - 1; i >= 0 && diffSum > 0; i--) { 
          diffSum -= diff[i];
          cnt++;
      }

      System.out.println(cnt);
  }
}