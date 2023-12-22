import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(attackNum(scanner.nextLong()));

	}

	static long attackNum(long X) {
		if (X == 1)
			return 1;
		return attackNum(X / 2) * 2+1;
	}

}
