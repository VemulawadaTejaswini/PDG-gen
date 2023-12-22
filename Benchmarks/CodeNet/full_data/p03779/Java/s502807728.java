import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		ABC056CSolve solve = new ABC056CSolve();
		solve.main();
	}
}

class ABC056CSolve {
	
	int X;
	
	ABC056CSolve() {
		Scanner cin = new Scanner(System.in);
		this.X = cin.nextInt();
	}
	
	void main() {
		
		int time = 0;
		int position = 0;
		while (position < X) {
			time++;
			position = (time*(time + 1)) / 2;			
		}
		System.out.println(time);
	}
	
}
