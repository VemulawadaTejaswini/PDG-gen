import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 標準入力
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		String t = sc.nextLine();

		char[] sLis = s.toCharArray();
		char[] tLis = t.toCharArray();

		/*
		List<String> lines1 = Arrays.asList(line1.split(" "));
		List<String> lines2 = Arrays.asList(line2.split(" "));
		*/
		Arrays.sort(sLis);

		Arrays.sort(tLis);
		String t_1 = tLis.toString();
		String t_2 = new StringBuilder(t_1).reverse().toString();


		if (sLis.toString().compareTo(t_2) <= 0   ) {
			System.out.println("Yes");
			return;
		}

		System.out.println("No");
	}

}