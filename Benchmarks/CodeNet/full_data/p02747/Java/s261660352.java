import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		sc.close();
		List<String> list = Arrays.asList(in.split(""));
		int size = list.size();
		for (int i = 0; i < size; i++) {
			if (i % 2 == 0) {
				if (!list.get(i).equals("h")) {
					System.out.println("No");
					return;
				}
			} else {
				if (!list.get(i).equals("i")) {
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");

	}
}
