import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[] s = new String[n];
		for (int i = 0; i < n; i++) {
			char[] temp = scanner.next().toCharArray();
			Arrays.parallelSort(temp);
			s[i] = new String(temp);
		}
		String[] compared = Arrays.copyOf(s, s.length);
		int result = 0;
		String evaluated = null;
		for (int i = 0; i < n; i++) {
			evaluated = s[i];
			for (int j = i+1; j < n; j++) {
				if(evaluated.equalsIgnoreCase(compared[j])) {
					result++;
					continue;
				} else {
					continue;
				}
			}
		}
		System.out.println(result);
	}

}