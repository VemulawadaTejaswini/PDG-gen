import java.util.Scanner;

// https://atcoder.jp/contests/abc087/tasks/abc087_b
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();// 500円の枚数
		int b = scanner.nextInt();// 100円の枚数
		int c = scanner.nextInt();// 50円の枚数
		int x = scanner.nextInt();// 合計金額


		int count = 0;
		for(int i=0;i<=a;i++) {
			for(int j=0;j<=b;j++) {
				for(int k=0;k<=c;k++) {
					int sum = i*500+j*100+k*50;
					if(sum==x) {
						count++;
					}
				}
			}
		}

		System.out.println(count);
		scanner.close();
	}
}
