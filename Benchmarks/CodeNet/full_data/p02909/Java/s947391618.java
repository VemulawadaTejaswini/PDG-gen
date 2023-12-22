
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char[] s = scn.nextLine().toCharArray();

		String ans = "Sunny";
		if(s[0] == 'S') {
			ans = "Cloudy";
		}else if(s[0] == 'C') {
			ans = "Rainy";
		}
		System.out.println(ans);
	}

}
