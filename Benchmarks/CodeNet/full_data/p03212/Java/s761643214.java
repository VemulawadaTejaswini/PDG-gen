import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int[] arr = new int[] {3, 5, 7};

      System.out.println(dfs(0, arr, N));
  }

  private static int dfs(long curNum, int[] arr, int N) {
    if(curNum > N)
      return 0;

    int res = check(curNum, arr) ? 1 : 0;
    for(int a : arr) {
      res += dfs(curNum * 10 + a, arr, N);
    }
    return res;
  }

  private static boolean check(long curNum, int[] arr) {
    boolean[] flags = new boolean[10];
    while(curNum > 0) {
      flags[(int)(curNum % 10)] = true;
      curNum /= 10;
    }
    return flags[3] && flags[5] && flags[7];
  }
}