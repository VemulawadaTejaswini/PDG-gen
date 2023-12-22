import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int P = Integer.parseInt(sc.next());

		sc.close();

		int answer = ((3 * A) + P) / 2;

		System.out.println(answer);

	}

}
