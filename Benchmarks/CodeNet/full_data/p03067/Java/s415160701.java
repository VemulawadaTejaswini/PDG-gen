import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int line1 = sc.nextInt();
		int line2 = sc.nextInt();
		int line3 = sc.nextInt();
		
		if(line1 < line3 && line3 < line2 || line2 < line3 && line3 < line1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}