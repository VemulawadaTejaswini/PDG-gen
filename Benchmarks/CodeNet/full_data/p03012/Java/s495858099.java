import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] c = new int [n];
		for(int i = 0; i < n; i++) {
			c[i] = sc.nextInt();
		}
		int ans = 999999;

		for(int i = 1; i < n; i++) {
			int l=0,r=0;
			for(int j = 0;j < i;j++) {
				l+=c[j];
			}
			for(int j = i; j < n;j++) {
				r+=c[j];
			}
			ans = Math.min(ans, Math.abs(l-r));
		}
		System.out.println(ans);

	}

}