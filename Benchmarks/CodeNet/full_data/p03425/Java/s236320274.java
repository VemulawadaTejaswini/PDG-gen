import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[5];
		sc.nextLine();
		while (n-- > 0) {
			String s = sc.nextLine();
			if (s.length() == 0) continue;
			switch (s.charAt(0)) {
				case 'M':
					a[0]++;
					break;
				case 'A':
					a[1]++;
					break;
				case 'R':
					a[2]++;
					break;
				case 'C':
					a[3]++;
					break;
				case 'H':
					a[4]++;
					break;
			}
		}

		long answer = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				for (int k = j + 1; k < a.length; k++) {
					answer += a[i] * a[j] * a[k];
				}
			}
		}
		System.out.println(answer);

	}
}
