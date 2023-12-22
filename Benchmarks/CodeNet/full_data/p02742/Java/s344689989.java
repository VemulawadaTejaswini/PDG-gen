import java.util.Scanner;

// https://atcoder.jp/contests/panasonic2020/tasks/panasonic2020_b
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		long H = sc.nextInt();//行
		long W = sc.nextInt();//列
		sc.close();

		long a;

		if(W%2==0) {
			a = W/2;
			System.out.println(a*H);
		}else {
			a = W/2 + 1;
			if(H%2==0) {
				long A = H/2;
				System.out.println(a*A + (a - 1)*A);
			}else {
				if(H==1) {
					System.out.println(a);
				}else {
					long A = H/2;
					System.out.println((2*a-1)*A + a);
				}
			}
		}


	}
}
