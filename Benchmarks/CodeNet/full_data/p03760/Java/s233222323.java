import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String O = sc.next();
		String E = sc.next();
		int o = O.length();
		int e = E.length();
		for(int i = 0 ; i < e ; i++) {
			System.out.print(String.valueOf(O.charAt(i)) + String.valueOf(E.charAt(i)));
			if(o > i) {
				System.out.print(String.valueOf(O.charAt(o - 1)));
			}
		}
	}
}
