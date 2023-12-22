import java.text.ParseException;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		char[] array = s.toCharArray();
		int count = 0;
		int max = 0;

		for (char c : array) {
			switch (c) {
			case 'A':
				count++;
				break;
			case 'T':
				count++;
				break;
			case 'G':
				count++;
				break;
			case 'C':
				count++;
				break;
			default:
				if (count > max) {
					max = count;
				}
				count = 0;
			}

		}
		System.out.println(max);

	}

}
