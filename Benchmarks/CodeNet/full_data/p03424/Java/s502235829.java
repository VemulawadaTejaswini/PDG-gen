import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//(pink and white and green) or (pink and white and green and yellow) 
		int n = scanner.nextInt();
		boolean existsY = false;
		for (int i = 0; i < n; i++) {
			if(scanner.next().equals("Y")) {
				existsY = true;
				break;
			}
		}
		if (existsY) {
			System.out.println("Four");
		}else {
			System.out.println("Three");
		}
		scanner.close();

	}

}
