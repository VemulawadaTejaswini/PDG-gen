import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int min = Integer.MAX_VALUE;
      int max = Integer.MIN_VALUE;
      int[] arr = new int[n];
      for(int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
        min = Math.min(min, arr[i]);
        max = Math.max(max, arr[i]);
      }

      while(min <= max) {
        int mid1 = min + (max - min) / 3;
        int mid2 = max - (max - min) / 3;
        int res1 = dist(arr, mid1);
        int res2 = dist(arr, mid2);
        if(res1 >= res2) {
            min = mid1 + 1;
        } else {
            max = mid2 - 1;
        }
      }

      System.out.println(dist(arr, max));
  }
  private static int dist(int[] arr, int num) {
    int res = 0;
    for(int a : arr) {
      res += (num - a) * (num - a);
    }
    return res;
  }

}