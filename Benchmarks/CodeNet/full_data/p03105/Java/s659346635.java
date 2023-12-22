import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int a, b, c;
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		
		scanner.close();
		
		int answer = b/a;
		
		if (answer > c) {
			answer = c;
		}
		
		System.out.println(answer);
	}

}