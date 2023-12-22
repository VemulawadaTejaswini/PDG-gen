import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String N = scanner.nextLine();
		int Num = Integer.parseInt(N);
		int length = String.valueOf(N).length();

		int num = 0;

//		StringBuilder sb = new StringBuilder(N);

		ArrayList<Integer> numbers = new ArrayList<Integer>();

		for(int i = 0; i < length;) {
			String S = N.substring(i, ++i);
			int j = Integer.parseInt(S);
			numbers.add(j);
		}

		for (int k : numbers) {
			num += k;
		}

		if (Num % num == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}


	}

}