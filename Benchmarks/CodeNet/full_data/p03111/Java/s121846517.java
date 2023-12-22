import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();
      int[] arr = new int[n];
      for(int i = 0; i < n; i++)
        arr[i] = sc.nextInt();

      long mp = dfs(arr, A, B, C, 0, 0, 0, 0);
      System.out.println(mp);
  }

  private static long dfs(int[] arr, int A, int B, int C, int curA, int curB, int curC, int curN) {
    if(curN == arr.length) {
      if(curA  == 0 || curB  == 0 || curC == 0)
        return Integer.MAX_VALUE;
      else
        return Math.abs(A - curA) + Math.abs(B - curB) + Math.abs(C - curC) - 30;
    }

    long rest0 = dfs(arr, A, B, C, curA, curB, curC, curN + 1);
    long rest1 = dfs(arr, A, B, C, curA + arr[curN], curB, curC, curN + 1) + 10;
    long rest2 = dfs(arr, A, B, C, curA, curB + arr[curN], curC, curN + 1) + 10;
    long rest3 = dfs(arr, A, B, C, curA, curB, curC + arr[curN], curN + 1) + 10;
    return Math.min(rest0, Math.min(rest1, Math.min(rest2, rest3)));
  }
}