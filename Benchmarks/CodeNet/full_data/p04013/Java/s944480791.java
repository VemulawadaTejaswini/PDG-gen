import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a = sc.nextInt();
      int[] arr = new int[n];
      for(int i = 0; i < n; i++)
        arr[i] = sc.nextInt();

      HashMap<String, Long> memo = new HashMap<>();
      long res = dfs(arr, a, memo, 0, 0, 0);
      
      System.out.println(res);
  }

  private static long dfs(int[] arr, int a, HashMap<String, Long> memo, int idx, int n, long curSum) {
     if(memo.containsKey(curSum + "-" + idx + "-" + n)) 
        return memo.get(curSum + "-" + idx + "-" + n);
     long res = 0;
     if(n != 0 && n * a == curSum) {
        res = 1;
     }

     for(int i = idx; i < arr.length; i++) {
        res += dfs(arr, a, memo, i + 1, n + 1, curSum + arr[i]);
     }
     memo.put(curSum + "-" + idx + "-" + n, res);
     return res;
  }
}