
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] lines = line.split(" ");
		int K = Integer.parseInt(lines[0]);
		int X = Integer.parseInt(lines[1]);

		int min = X - K + 1;
		int max = X + K - 1;
		for(int i = min; i <= max ;i++) {
			if(i == max) {
				System.out.println(i);
			}else {
				System.out.print(i + " ");
			}
		}
	}

}
