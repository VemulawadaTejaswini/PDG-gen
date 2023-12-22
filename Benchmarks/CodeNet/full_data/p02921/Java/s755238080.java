import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String anticipation = sc.next();
		String real = sc.next();
		List<String> AList = Arrays.asList(anticipation.split(""));
		List<String> RList = Arrays.asList(real.split(""));

		int count = 0;
		for (int i = 0; i < 3; i++) {
			String a = AList.get(i);
			String r = RList.get(i);

			if (a.equals(r)) {
				count++;
			}
		}

		System.out.println(count);
	}
}
