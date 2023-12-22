import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      long[] arr = new long[n];
      for(int i = 0; i < n; i++)
        arr[i] = sc.nextInt();

      long sum = arr[0];
      for(int i = 1; i < n-1; i++) {
        if(i % 2 == 1)
          sum = sum - arr[i];
        else
          sum = sum + arr[i];
      }

      long[] res = new long[n];
      res[0] = sum + arr[n - 1];
      res[n-1] = arr[n-1] * 2 - res[0];
      for(int i = 1; i < n - 1; i++)
        res[i] = arr[i-1] * 2 - res[i-1];
      for(int i = 0; i < n; i++)
        System.out.print(res[i] + " ");
      System.out.println();
  }
}