
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 1;
		int H1 = 0;

		for(int i = 0; i < N; i++) {
			if(i == 0) {
				H1 = sc.nextInt();
			}else {
				if(H1 <= sc.nextInt()) {
					count++;
				}
			}
		}

		System.out.println(count);
	}

}
