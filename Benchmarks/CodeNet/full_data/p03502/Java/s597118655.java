import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		String in = scanner.nextLine();
		
		int a = Integer.parseInt(in);
		
		String[] nums = in.split("");
		
		int sum = 0;
		for (String num : nums) {
			sum += Integer.parseInt(num);
		}
		
		if (a % sum == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}
		
}
