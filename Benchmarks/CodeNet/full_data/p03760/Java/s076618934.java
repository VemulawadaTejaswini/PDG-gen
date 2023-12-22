import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] o = scanner.next().toCharArray(), e = scanner.next().toCharArray();
		int len = o.length + e.length;
		char[] passwords = new char[len];
		int count = 0;
		for (int i = 0; i < len; i++) {
			if (count>=len) {
				break;
			}
			passwords[count] = o[i];
			count++;
			if (count>=len) {
				break;
			}
			passwords[count] = e[i];
			count++;
		}
		
		System.out.println(new String(passwords));
		scanner.close();
	}
}
