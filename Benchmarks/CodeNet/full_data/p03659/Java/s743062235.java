import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
		int[] list = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
          int value = sc.nextInt();
          sum += value;
          list[i] = sum;
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
          int value = Math.abs(list[i] - (sum - list[i]));
          if (ans > value) {
            ans = value;
          }
        }
      
		// 出力
		System.out.println(ans);
	}
}