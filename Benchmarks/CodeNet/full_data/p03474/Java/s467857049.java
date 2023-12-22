import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s = sc.next();
		sc.close();
		
		if (s.matches("^\\d{" +a+ "}-\\d{" +b+ "}$")) {
			System.out.println("Yes");
	    } else {
			System.out.println("No");
		}
		
	}

}
