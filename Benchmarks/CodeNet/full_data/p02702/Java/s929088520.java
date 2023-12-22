import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String S = scanner.nextLine();
		int count = 0;
		for(int i = 0; i <= S.length() - 4; i++) {
			for(int j = i + 4; j <= S.length(); j++) {
				if(Long.parseLong(S.substring(i, j)) % 2019 == 0) count++;
			}
		}
		System.out.println(count);
	}
}
