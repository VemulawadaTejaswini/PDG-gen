import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String C = sc.next();
		sc.close();
		char n = C.charAt(0);
		System.out.println((char)(n+1));
	}

}