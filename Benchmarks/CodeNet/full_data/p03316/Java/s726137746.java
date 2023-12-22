import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solve(new Scanner(System.in));
	}
	
	public void solve(Scanner sc) {
		int n = Integer.parseInt(sc.next());
		
		int sn = 0;
		
		int tmpN = n;
		while(tmpN > 0) {
			sn += tmpN % 10;
			tmpN /= 10;
		}
		
		if(n % sn == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
