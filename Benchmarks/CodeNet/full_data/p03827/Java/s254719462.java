
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//入力データを変数で受け取る
		int n = sc.nextInt();
		String s = sc.next();


		int x = 0;
		int[] array = new int[n + 1];
		array[0] = x;
		//入力データを処理して、結果を出力
		for(int i = 0; i < n; i++) {
			if(s.charAt(i) == 'I') {
				x++;
			} else {
				x--;
			}
			array[i + 1] = x;
		}
		Arrays.sort(array);
		System.out.println(array[n]);
	}
}

