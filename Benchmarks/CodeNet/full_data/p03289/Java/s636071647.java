import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String regString = "^A[a-z]*C[a-z]*";
		String regString2 = "[a-z]*C[a-z]*";
		String t = s.substring(2, s.length()-1);

		if (s.matches(regString)&&t.matches(regString2)) {
			System.out.println("AC");
		}else {
			System.out.println("WA");
		}

	}


}

