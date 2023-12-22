import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int count = K;
		int ans = 0;
		int a = 0;

		for (int i = 0;i < N; i++) {
			a = sc.nextInt();
			int b = sc.nextInt();
			count = count - b;
			if (count <= 0) {
				System.out.println(a);
				System.exit(0);
			}
		}


		System.out.println(a);



	}

}