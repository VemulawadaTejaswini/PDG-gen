
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			char[] str = sc.next().toCharArray();
			char A = 'A';
			char B = 'B';
			char C = 'C';

			int count = 0;
			for (int i = 0; i < str.length - 2; i++) {
				if (str[i] == A) {
					for (int j = i + 1; j < str.length - 1;) {
						if (str[j] == A) {
							j++;
						} else if(str[j] == B && str[j+1] == C){
							count++;
							j += 2;
						} else {
							break;
						}
					}

				}
			}

			System.out.println(count);
		}
	}
}
