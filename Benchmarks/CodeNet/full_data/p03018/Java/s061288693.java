
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			char[] str = sc.next().replaceAll("BC", "D").toCharArray();
			int count = 0;
			int acount = 0;
			for (char ch : str) {
				switch(ch) {
				case 'A':
					acount++;
					break;
				case 'D':
					count += acount;
					break;
				default:
					acount = 0;
				}
			}

			System.out.println(count);
		}
	}
}
