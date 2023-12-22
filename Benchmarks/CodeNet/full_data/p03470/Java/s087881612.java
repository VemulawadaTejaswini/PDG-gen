import java.util.Arrays;
import java.util.Scanner;

// https://atcoder.jp/contests/abc085/tasks/abc085_b
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int[] numbers = new int[n];
		for(int i=0;i<n;i++) {
			numbers[i] = scanner .nextInt();
		}

		scanner.close();

		Arrays.sort(numbers);

		int sum = 1;
		int number1 = numbers[0];
		for(int i=1;i<n;i++) {
			if(number1!=numbers[i]) {
				sum++;
				number1 = numbers[i];
			}
		}
		System.out.println(sum);

	}

}
