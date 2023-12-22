import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int ballsCount = 0;

		String line = sc.nextLine();
		String[] lines = line.split("");

		for (int i = 0; i < lines.length; i++) {
			if (1 == Integer.parseInt(lines[i])) {
				ballsCount++;
			}else {

			}
		}
		
		System.out.println(ballsCount);
	}

}
