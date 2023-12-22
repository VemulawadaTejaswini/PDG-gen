import java.util.Scanner;

public class Main {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Integer n = sc.nextInt();
		String s = sc.next();
		String[] strs = s.split("");
		String before = "first";
		int count = 0;

		for (String str : strs) {
			if (!str.equals(before)) {
				count += 1;
				before = str;
			}
		}

		System.out.println(count);
	}

}