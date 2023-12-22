import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String[] o = scanner.next().split("");
		String[] e = scanner.next().split("");
		String[] i = scanner.next().split("");

		System.out.print(o[0].toUpperCase() + e[0].toUpperCase() + i[0].toUpperCase());
	}
}