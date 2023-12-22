
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int pow = 0;
		int i = 1;
		while (true) {
			pow = i * i;
			if (pow == n) {
				break;
			}
			
			if (pow > n) {
				i--;
				break;
			}
			i++;
		}
		
		System.out.println(i * i);
	}
}