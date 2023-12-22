import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		String word = sc.next();


		int current =0;
		int max = 0;
		for (int i = 0; i < word.length(); ++i) {
			char c = word.charAt(i);
			if (c == 'A' || c == 'T' || c == 'C' || c == 'G') {
				++current;
			}
			else
			{
				max = Math.max(max, current);
				current = 0;
			}
		}
		max = Math.max(max, current);
		System.out.println(max);

	}

}
