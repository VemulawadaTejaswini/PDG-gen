import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int ytotal = scanner.nextInt();
		int xtotal = scanner.nextInt();
		int c = scanner.nextInt();
		
		if(Math.sqrt(xtotal) + Math.sqrt(ytotal) < Math.sqrt(c)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}
			
}