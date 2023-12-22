import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int N = input.nextInt();
		input.nextLine();
		String A = input.nextLine();
		String B = input.nextLine();
		String C = input.nextLine();

		int count = 0;
		for (int i=0;i<N;i++) {
			char c1 = A.charAt(i);
			char c2 = B.charAt(i);
			char c3 = C.charAt(i);

			if (c1 == c2 && c2 == c3) {
				// do nothing
			}else if (c1 == c2 && c2 != c3) {
				count++;
			} else if (c1 != c2 && c2 == c3) {
				count++;
			} else if (c1 == c3 && c3 != c2) {
				count++;
			} else {
				count += 2;
			}
		}

		System.out.println(count);
	}

}
