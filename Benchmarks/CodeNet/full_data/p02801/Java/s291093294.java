import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] c = s.toCharArray();
		int a = (int)(c[0]);
		a += 1;
		System.out.println((char)a);
	}

}