import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 全体の個数から、余りがKより小さいものを引く
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		int cnt=0;
		for (int a = 1; a <= n; a++) {
			for (int b = 1; b <= n; b++) {
				if(a%b>=k){
					cnt++;
				}
			}
		}

		System.out.println(cnt);

	}

}