import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		String output = new String();
		for (int i = 0; i < str.length(); i++) {
			char c = calcChar(str.charAt(i), n);
			output = output + c;
		}
		System.out.println(output);
	}

	public static char calcChar(char ch, int n) {
		for (int i = 0; i < n; i++) {
			if (ch == 'Z') {
				ch = 'A';
			} else {
				ch++;
			}
		}
		return ch;
	}

}