import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
        int[] list = new int[n - 1];
		for(int i = 0; i < n - 1; i++) {
          list[i] = sc.nextInt();
        }
        int ans = 0;
        int lastV = 0;
        for(int i = 0; i < n - 1; i++) {
            if (i == 0) {
              ans += list[i];
            }
            else if (list[i] > lastV) {
              ans += lastV;
            } else {
              ans += list[i];
            }
            if (i == n - 2) {
              ans += list[i];
            }
          lastV = list[i];
        }
    
		// 出力
		System.out.println(ans);
	}
}