
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			char[] str = sc.next().toCharArray();
			char A = 'A';
			char B = 'B';
			char C = 'C';

			int count = 0;
			int tmp = 0;
			do {
				tmp = 0;
				for(int i = 0; i < str.length - 2; i++) {
					if(str[i] == A) {
						if(str[i + 1] == B && str[i + 2] == C) {
							str[i] = B;
							str[i + 1] = C;
							str[i + 2] = A;
							i += 3;
							tmp++;
						}
					}
				}
				count += tmp;
			} while (0 < tmp);

			System.out.println(count);;
		}
	}
}
