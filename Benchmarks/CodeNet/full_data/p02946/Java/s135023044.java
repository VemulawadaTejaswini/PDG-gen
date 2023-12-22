import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int k = Integer.parseInt(sc.next());
		int x = Integer.parseInt(sc.next());

		for (int i = 0; i < k * 2 - 1; i++) {
			System.out.print(i==0 ? "":" ");
			System.out.print(x - (k - 1) + i);
		}
	}
}
