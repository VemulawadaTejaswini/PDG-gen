import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		ABC056ASolve solve = new ABC056ASolve();
		solve.main();
	}
}


class ABC056ASolve {
	
	char a;
	char b;
	
	ABC056ASolve() {
		Scanner cin = new Scanner(System.in);
		this.a = cin.next().charAt(0);
		this.b = cin.next().charAt(0);
	}
	
	void main() {
		char ans = 'a';
		if (a == 'H') {
			if (b == 'H') {
				ans = 'H';
			} else {
				ans = 'D';
			}
		} else {
			if (b == 'H') {
				ans = 'D';
			} else {
				ans = 'H';
			}
		}
		System.out.println(ans);
	}
	
}