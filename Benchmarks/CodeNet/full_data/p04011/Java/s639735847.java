import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		int x = sc.nextInt();
        int y = sc.nextInt();
      
        int ans = 0;
        if (n <= k) {
          ans += n * x;
        } else {
          ans += k * x;
          ans += (n - k) * y;
        }
    
		// 出力
		System.out.println(ans);
	}
}