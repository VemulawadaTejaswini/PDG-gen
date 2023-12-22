import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int numbers = sc.nextInt();
		int point = sc.nextInt();
		
		int min = point - numbers + 1;
		int max = point + numbers - 1;
		
		for(int i = min;i <= max;i++) {
			System.out.print(i + " ");
		}
	}
}
