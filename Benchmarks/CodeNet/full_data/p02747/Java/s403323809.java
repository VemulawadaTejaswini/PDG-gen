import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 数値
		String n1 = sc.next();

		// 文字列
		if (n1.equals("hi") || n1.equals("hihi") || n1.equals("hihihi") || n1.equals("hihihihi")
				|| n1.equals("hihihihihi")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}
