
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 1;
		int[] H = new int[N];

		for(int i = 0; i < N; i++) {
			H[i] = sc.nextInt();
		}

		boolean flag = false;
		for(int i = 1; i < N ; i++) {
			flag = true;
			for(int j = 0; j < i; j++) {
				if(H[j] <= H[i]) {
					flag = true;
				}
				else {
					flag = false;
					break;
				}
			}
			if(flag) {
				count++;
			}
		}
		System.out.println(count);
	}

}
