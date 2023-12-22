import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		Integer count = 0;

		for (Integer i = 0; i < 3; i++) {
			if (a.substring(i, i + 1) == "1") {
				count++;
			}

		}

		System.out.println(count);

	}

}