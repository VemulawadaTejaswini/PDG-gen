import java.util.Scanner;

public class Main {

	public static final long CONST = 100000007L;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long numN  = scan.nextLong();

		long count = numN * (numN - 1) / 2L;

		System.out.println(count);
	}
}
