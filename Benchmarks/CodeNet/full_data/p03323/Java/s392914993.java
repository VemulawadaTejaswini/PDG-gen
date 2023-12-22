import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solve(new Scanner(System.in));
	}
	
	public void solve(Scanner sc) {
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		
		if(a > 8 || b > 8) {
			System.out.println(":(");
		} else if(a + b >16) {
			System.out.println(":(");
		} else {
			System.out.println("Yay!");
		}
	}
}
