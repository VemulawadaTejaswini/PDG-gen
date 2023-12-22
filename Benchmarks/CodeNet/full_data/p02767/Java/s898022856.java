import java.util.Scanner;

// https://atcoder.jp/contests/abc156/tasks/abc156_c
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			array[i] = sc.nextInt();
		}
		sc.close();

		int ans = 99*99*100;
		for(int i=1;i<=101;i++) {
			int sum = 0;
			for(int j=0;j<n;j++) {
				sum = sum + (array[j]-i)*(array[j]-i);
			}
			ans = Math.min(ans, sum);
		}
		System.out.println(ans);
	}
}
