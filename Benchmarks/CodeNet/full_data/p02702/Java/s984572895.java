import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String string = String.valueOf((new Scanner(System.in)).next());
		int count = 0;
		for(int i = 0; i < string.length(); i++) {
			for(int j = string.length(); j >= i; j--) {
				try {
					if(Long.parseLong(string.substring(i, j)) % 2019 == 0) {
						count += 1;
					}
				}
				catch (NumberFormatException e) {
					break;
				}
			}
		}
		System.out.println(count);
	}
}
