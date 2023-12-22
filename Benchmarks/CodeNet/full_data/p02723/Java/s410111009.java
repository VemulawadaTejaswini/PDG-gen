import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String s = scanner.nextLine();
		
		scanner.close();
		
		String[] list = s.split("");
		
		if (list[2].equals(list[3]) && list[4].equals(list[5])) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
