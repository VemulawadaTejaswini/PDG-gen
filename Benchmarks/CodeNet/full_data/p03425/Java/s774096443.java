import java.util.*;

public class Main {
	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		int[] march = new int[5];

		for (int i = 0; i < N; i++) {
			String si = sc.next();
			switch (si.charAt(0)) {
			case 'M':
				march[0]++;
				break;
			case 'A':
				march[1]++;
				break;
			case 'R':
				march[2]++;
				break;
			case 'C':
				march[3]++;
				break;
			case 'H':
				march[4]++;
				break;
			default:
			}
		}

		long patterns = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++) {
				for (int k = j + 1; k < 5; k++) {
					patterns += march[i] * march[j] * march[k];							
				}
			}
		}
		System.out.println(patterns);
		sc.close();
	}

}