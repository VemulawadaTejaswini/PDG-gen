import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		long answer = 0;
		for(int i = 1; i <= N; i++) {
			if(i%3 != 0) {
				if(i%5 != 0) {
					answer += i;
					//System.out.println(i);
				}

			}
		}

		System.out.println(answer);
	}
}