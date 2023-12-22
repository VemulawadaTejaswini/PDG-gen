import java.util.Scanner;

// A - BuyingSweets

public class Main {
	
	int X = 0;
	int A = 0;
	int B = 0;
	int ans = 0;
	int sum = 0;
	
	public static void main(String[] args) {
		new Main().run();
	}
	void run() {
		Scanner sc = new Scanner(System.in);
		X = sc.nextInt();
		A = sc.nextInt();
		B = sc.nextInt();
		ans = X - A;
		
		while(ans >= 0) {
			ans -= B;
		}
		System.out.println(ans + B);
	}
}