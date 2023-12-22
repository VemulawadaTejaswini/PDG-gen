import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = 0;
		if(N % 2 == 0) {
			M = N / 2;
		}else {
			M = N / 2 + 1;
		}

		int counter = 0;
		for(int i = 1; i < M; i++) {
			if( (N - i) != i) {
				counter++;
			}else {

			}
		}
		System.out.println(counter);
	}

}
