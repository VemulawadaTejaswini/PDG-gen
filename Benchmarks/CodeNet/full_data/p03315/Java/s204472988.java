import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int number = 0;
		List<String> a = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		String in = sc.next();

		for (int i = 0; i < in.length(); i++) {
			char b = in.charAt(i);
			String c = String.valueOf(b);
			a.add(c);
		}

		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).equals("+")) {
				number++;
			} else if (a.get(i).equals("-")) {
				number--;
			}
		}
		sc.close();

		System.out.println(number);

	}

}
