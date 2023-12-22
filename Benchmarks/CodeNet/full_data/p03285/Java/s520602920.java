import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solve(new Scanner(System.in));
	}
	
	public void solve(Scanner sc) {
		int n = Integer.parseInt(sc.next());
		
		if(n % 7 == 0 || n % 4 == 0) {
			System.out.println("Yes");
			return;
		}
		
		int maxDonuts = n / 7 + 1;
		int currentSum = 7 * maxDonuts;
		
		while(currentSum > 0) {
			currentSum -= 3;
			if(currentSum == n) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}
