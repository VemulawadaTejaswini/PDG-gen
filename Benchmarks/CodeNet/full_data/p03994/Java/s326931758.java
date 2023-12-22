import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		int num = scanner.nextInt();
		scanner.close();
		char[] alphabet = str.toCharArray();
		for (int i = 0; i < alphabet.length; i++) {
			int tem = alphabet[i];
			int temDif = 123 - tem;
			if (temDif <= num) {
				alphabet[i] = 'a';
				num = num - temDif;
			}
		}
		if (num > 0) {
			alphabet[alphabet.length - 1] += num;
		}
		str = new String(alphabet);
		System.out.println(str);
	}
}
