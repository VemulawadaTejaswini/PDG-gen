import java.util.Scanner;

class Main{



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int ans = 0;
		for(int i = 1;i <= n;i++){
			ans += i;
		}
		System.out.println(ans);
	}
}