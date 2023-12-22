import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s = sc.next();
		
		if(s.charAt(a) == 's') {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}