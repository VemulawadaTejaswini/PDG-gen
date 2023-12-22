import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double ytotal = scanner.nextLong();
		double xtotal = scanner.nextLong();
		double c = scanner.nextInt();
		
		if(Math.sqrt(xtotal) + Math.sqrt(ytotal) < Math.sqrt(c)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}
			
}
