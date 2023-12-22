import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		String s = sc.next();
		String[] alpha = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		String[] str = s.split("");

		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < 26; j++) {
				if(str[i].equals(alpha[j])) {
					System.out.print(alpha[(j + n) % 26]);
					break;
				}
			}
		}
	}
}