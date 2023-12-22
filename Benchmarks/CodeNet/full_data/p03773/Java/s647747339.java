import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		ABC057AASolve solve = new ABC057AASolve();
		solve.main();
	}
}

class ABC057AASolve {
	
	int A;
	int B;
	
	ABC057AASolve() {
		Scanner cin = new Scanner(System.in);
		this.A = cin.nextInt();
		this.B = cin.nextInt();
	}
	
	void main() {
		int time = A + B;
		System.out.println(time % 24);
	}
}