import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[] b = new int[n - 1];
		for(int i = 0; i < n - 1; i++) {
			b[i] = Integer.parseInt(sc.next());
		}
		sc.close();
		System.out.println(new Main().maximal_value(n, b));
	}
	
	public int maximal_value(int n, int[] b) {
		int sum = b[n - 2];
		for(int i = n - 2; i > 0; i--) {
			sum += (b[i] <= b[i - 1]) ? b[i] : b[i - 1];
		}
		return sum + b[0];
		
	}
}