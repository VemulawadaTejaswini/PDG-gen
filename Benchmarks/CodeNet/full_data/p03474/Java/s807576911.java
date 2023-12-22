import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s = sc.next();
		sc.close();
		
		if (s.matches("^\\d{3}-\\d{4}$")) {
			System.out.println("Yes");
	    } else {
			System.out.println("No");
		}
		
	}

}