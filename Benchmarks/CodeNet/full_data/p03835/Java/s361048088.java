import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 
		//ある値の最大値
		int k = scanner.nextInt();
		// 合計値
		int s = scanner.nextInt();
		// sC2 最大値を考慮しない場合 区切り s + 2箇所
		add(0, 0, s, k);
		System.out.println(count);
	}
	
	private static int count;
	public static void add(int deep, int sum, int ans,int max){
		if (deep == 3) {
			if (sum == ans) {
				count++;
			}
			return;
		}
		for (int i = 0; i <= max; i++) {
			if (sum > ans) {
				return;
			}
			add(deep + 1, sum + i ,ans, max);
		}
		return;
	}
}
