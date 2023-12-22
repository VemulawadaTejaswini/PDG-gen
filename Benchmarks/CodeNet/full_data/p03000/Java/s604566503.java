import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int n = sc.nextInt();
		int x = sc.nextInt();

		int ans = 0;
		int sum = 0;

		while(sum<=x&&ans<n){
			sum += sc.nextInt();
			ans++;
		}

		// 出力
		System.out.println(ans);
	}
}