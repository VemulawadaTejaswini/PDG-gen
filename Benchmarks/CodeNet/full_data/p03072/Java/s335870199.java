import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int foo[] = new int[N];
		int count = 1;
		boolean judge = true;
		for (int i = 0; i < N; i++) {
			foo[i] = sc.nextInt();

		}

		for (int i = 1; i < foo.length; i++) {

			for (int j = 0; j < i; j++) {

				if(foo[j] >  foo[i]) {
					judge = false;
				}

			}
			if(judge) {
				count++;
			}
			judge = true;

		}
		System.out.println(count);
	}

}
