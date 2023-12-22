
import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int sum = 0, max = 0;
		
		for (int i = 0; i < n; i++) {
			int p = sc.nextInt();
			sum += p;
			max = Math.max(max, p);
		}
		
		System.out.println(sum - max / 2);
	}
	
}
