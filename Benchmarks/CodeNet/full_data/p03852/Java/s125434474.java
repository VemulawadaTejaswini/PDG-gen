import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String x = scan.next();
		char n = x.charAt(0);
		if(n == 'a'|| n == 'i'|| n == 'o'
				||n == 'e'|| n == 'u') {
			System.out.println("vowel");
		}else {
			System.out.println("consonant");
		}
	}

}
