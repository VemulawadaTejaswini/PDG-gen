import java.util.Scanner;

public class NextAlphabet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		sc.close();
		char[] b = a.toCharArray();
		int c = b[0] + 1;
		char d = (char)c;
		System.out.println(d);
	}
	
}
