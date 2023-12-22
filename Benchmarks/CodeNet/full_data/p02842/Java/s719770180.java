import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());

		boolean flg = true;
		for (int i = 1; i <= 50000; i++) {
			int zeikomi = (int) (i * 1.08);
			if (zeikomi == n) {
				System.out.println(i);
				flg = false;
			}
		}
		if (flg) {
			System.out.println(":(");
		}

	}

}