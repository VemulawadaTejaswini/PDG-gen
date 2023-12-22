import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		String str = scanner.next();
		String[] S1 = new String[N];
		int[] S2 = new int[N];
		int count = 0;
		int num = 1000;

		for (int i = 0; i < N; i++) {
			String str2 = String.valueOf(str.charAt(i));
			S1[i] = str2;
		}

		for (int i = 0; i < N; i++) {
			if (S1[i].equals(".")) {
				S2[i] = 0;
				count += 1;
			} else {
				S2[i] = 1;
			}
		}

		for (int i = 0;i < N; i++) {
			if(S2[i] == 1) {
				num = 0;
				for (int j = i + 1; j < N; j++) {
					if(S2[j] == 0) {
						num += 1;
					}
				}
			}
		}
		//System.out.println(num);

		if (count == N) {
			System.out.println(0);
		} else if (count == 1 && S2[0] == 0) {
			System.out.println(0);
		} else if (num == 0) {
			System.out.println(0);
		} else {
			System.out.println(count);
		}
//		for (int i = 0; i < N; i++) {
//			System.out.println(S2[i]);
//		}
	}
}