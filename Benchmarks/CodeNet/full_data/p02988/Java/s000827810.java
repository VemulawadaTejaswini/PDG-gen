import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] p = new int[n];
		
		for (int i = 0; i < n; i++) {
			p[i] = scan.nextInt();
		}
		
		int[] three = new int[3];
		int count = 0;
		for (int i = 1; i < n - 1; i++) {
			three[0] = p[i - 1];
			three[1] = p[i];
			three[2] = p[i + 1];
			
			if (three[1] >= three[0] && three[1] < three[2]) count++;
			if(three[1] < three[0] && three[1] >= three[2]) count++;
		}
		
		System.out.println(count);
	}
}