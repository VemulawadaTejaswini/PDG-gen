
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		Main solution = new Main();
		int ans = solution.calculator(n, a, b);
		System.out.println(ans);
		
		scanner.close();
		
	}
	
	public int calculator(int n,int a, int b) {
		int res = n*a;
		if (res<b) {
			res = b;
		}
		return res;
	}

}
