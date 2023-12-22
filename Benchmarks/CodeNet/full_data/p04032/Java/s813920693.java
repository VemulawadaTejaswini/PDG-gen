import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<String> s = Arrays.asList(scanner.next().split(""));

		if(s.size() == 2 && (s.get(0).equals(s.get(1))) ) {
			System.out.println("1 2");
			return;
		}

		for(int i = 0 ; i < s.size() - 2 ; i++) {
			List<String> t = s.subList(i, i + 3);
			if ((t.stream().filter(u -> u.equals(t.get(0))).count() > 1) ||
					(t.stream().filter(u -> u.equals(t.get(1))).count() > 1))  {
				System.out.println((i + 1) + " " + (i + 3));
				return;
			}
		}

		System.out.println("-1 -1");

		scanner.close();
	}
}
