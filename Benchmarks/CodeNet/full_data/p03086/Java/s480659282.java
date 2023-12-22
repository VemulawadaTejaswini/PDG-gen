import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		int maxCount = 0;
		int count = 0;
		for (char c : s.toCharArray()) {
			if (c == 'A'
					|| c == 'T'
					|| c == 'C'
					|| c == 'G') {
				count++;
			} else {
				if (maxCount < count) {
					maxCount = count;
					count = 0;
				}
			}
		}
		if (maxCount < count) {
			maxCount = count;
			count = 0;
		}
		System.out.println(maxCount);


	}

}