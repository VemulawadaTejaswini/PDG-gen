import java.util.Scanner;
import java.util.Arrays;

class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();

		String[] s = new String[k];

		for (int i = 0; i < k; i++) {
			s[i] = in.next();
		}

		long sum = 0;
		boolean isOK = false;

		while (true) {
			sum += n;
			isOK = true;

			String sumstr = Long.toString(sum);
			
			for (int i = 0; i < sumstr.length(); i++) {
				for (int j = 0; j < k; j++) {
					if (sumstr.substring(i, i + 1).equals(s[j])) {
						isOK = false;
					}

				}
			}
			if (isOK == true) {
				break;
			}
		}

		System.out.println(sum);
		in.close();

	}

}