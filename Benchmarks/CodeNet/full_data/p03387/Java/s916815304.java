
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//入力データを変数で受け取る
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		//入力データを処理して、結果を出力
		int[] array = {a, b, c};
		Arrays.sort(array);
		
		int count = 0;
		if((array[2] - array[1]) % 2 == (array[2] - array[0]) % 2) {
			count = ((array[2] - array[1]) + (array[2] - array[0])) / 2;
		} else {
			count = ((array[2] - array[1]) + (array[2] - array[0]) + 3) / 2;
		}
		
		System.out.println(count);

	}
}
