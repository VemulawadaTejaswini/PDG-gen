import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int zero = 0, one = 0;
		
		String str;
		Scanner scanner = new Scanner(System.in);
		
		str = scanner.next();
		scanner.close();
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '0') {
				zero++;
			} else {
				one++;
			}
		}
		System.out.println(Math.min(zero, one)*2);
	}

}
