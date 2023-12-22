import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		List<String> abList = Arrays.asList("a", "b");
		List<List<String>> list = new ArrayList<>();
		list.get(0).add("");

		for (int i = 1; i < n + 1; i++) {
			List<String> before = list.get(i - 1);
			List<String> current = new ArrayList<>();
			for (String bf : before) {
				for (String ab : abList) {
					current.add(bf + ab);
				}
			}
		}
		list.get(n).forEach(System.out::println);
	}
}
