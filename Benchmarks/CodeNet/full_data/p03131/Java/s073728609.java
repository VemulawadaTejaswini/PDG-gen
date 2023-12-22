import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().solve(new Scanner(System.in));
	}
	
	public void solve(Scanner sc) {
		long k = Integer.parseInt(sc.next());
		long a = Integer.parseInt(sc.next());
		long b = Integer.parseInt(sc.next());
		
		if(a >= b - 2) {
			System.out.println(k+1);
			return;
		}
		
		long bisk = 1;
		long money = 0;
		while(k>0) {
			if(money >= 1) {
				money--;
				bisk += b;
			} else if(k>=2 && bisk>=a) {
				bisk -= a;
				money++;
			} else {
				bisk++;
			}
			k--;
		}
		System.out.println(bisk);
	}
}
