
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] cs = sc.next().toCharArray();
		int result = 0;
		for (int i = 0; i < cs.length; i++) {
			int count = 0;
			for (int j = i; j < cs.length; j++) {
				if (cs[j] == 'A' || cs[j] == 'C' || cs[j] == 'G' || cs[j] == 'T') {
					count++;
				} else {
					break;
				}
			}
			result = Math.max(count, result);
		}
		System.out.println(result);
		sc.close();
	}
}