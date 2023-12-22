import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		double sa = Math.sqrt(a);
		double sb = Math.sqrt(b);
		double sc = Math.sqrt(c);
		String result = sa+sb<sc ? "Yes" : "No";
		System.out.println(result);
		scanner.close();
	}
}
