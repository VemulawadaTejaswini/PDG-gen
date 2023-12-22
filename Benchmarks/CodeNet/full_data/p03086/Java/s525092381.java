import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String txt = scn.next() + " ";
		int x = 0;
		for (int i = 0; i < txt.length(); i++) {
			switch (txt.charAt(i)) {
			case 'A':
			case 'C':
			case 'T':
			case 'G':
				for (int j = i; j < txt.length(); j++) {
					switch (txt.charAt(j)) {
					case 'A':
					case 'C':
					case 'T':
					case 'G':
						continue;
					default:
						if (x < j - i) {
							x = j - i;
						}
					}
					i = j;
					break;
				}
			}
		}
		System.out.println(x);
		scn.close();
	}
}