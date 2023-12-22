import java.util.Scanner;

public class Main {



	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);

		// N円
		int N = scan.nextInt();

		// A枚
		int A = scan.nextInt();


		int tmp = A;

		while(tmp != N) {
			if(tmp >= N) {
				break;
			}
			tmp += 500;
		}

		if(tmp == N || N <= A) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}


	}
}
