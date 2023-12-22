import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int k = 0;
		int l = s.length();
		for(int j = 0; j < l; j++ ) {
			s = s.substring(0, s.length() - 1);
				if (s.substring(0, s.length() / 2).equals(s.substring(s.length() / 2))){
					k = s.length();
					break;
				}
		}
		System.out.println(k);
	}
}