
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//入力データを変数で受け取る
		int n = sc.nextInt();
		int[] array = new int[n];

		for(int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		//入力データを処理して、結果を出力
		int output = 1;
		int updown = 0;

		for(int i = 1; i < n; i++) {
			if(updown == 0) {
				if(array[i - 1] < array[i]) {
					updown = 1;
				} else if(array[i - 1] > array[i]) {
					updown = 2;
				}
			}else {
				if(array[i - 1] < array[i] && updown == 2) {
					updown = 0;
					output++;
				} else if(array[i - 1] > array[i] && updown == 1) {
					updown = 0;
					output++;
				}
			}
		}

		System.out.println(output);

	}
}