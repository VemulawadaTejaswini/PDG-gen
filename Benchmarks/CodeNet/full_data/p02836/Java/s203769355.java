import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder src = new StringBuilder(sc.nextLine());
		int count = 0;

		int len = src.length();
		for (int i = 0; i < ((Integer) len / 2); i++ ) {
			if (src.charAt(i) != src.charAt(len - (i+1))) {
				src.replace(len - (i+1), len - i, String.valueOf(src.charAt(i)));
				count++;
			}
		}

		System.out.println(count);
	}

}
