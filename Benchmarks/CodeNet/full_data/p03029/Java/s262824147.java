import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Integer full = sc.nextInt();
		Integer piece = sc.nextInt();

		System.out.println(calc(full,piece));
	}

	private static Integer calc(Integer full, Integer piece) {
		Integer pieces = full * 3 + piece;
		return pieces / 2;
	}


}
