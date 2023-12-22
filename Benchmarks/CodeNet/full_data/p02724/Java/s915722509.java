import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = Integer.parseInt(sc.next());
		sc.close();

		//嬉しさ1000の合計
		int happy1000 = (X / 500) * 1000;
		int happy5 = (X % 100) / 5 * 5;

		int sum = happy1000 + happy5;
		System.out.println(sum);
	}

}
