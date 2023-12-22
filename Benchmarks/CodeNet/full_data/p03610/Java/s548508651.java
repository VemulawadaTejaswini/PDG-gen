import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		String s = scan.nextLine();

		char[] c = s.toCharArray();
		String ans = "";

		for(int i = 0; i<s.length();i+=2){
			ans += String.valueOf(c[i]);
		}
		System.out.println(ans);
	}
}