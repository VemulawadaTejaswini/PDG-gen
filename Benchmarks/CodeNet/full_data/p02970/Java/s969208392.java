import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);
	
	
	void compute() {
		int N = scan.nextInt();
		int D = scan.nextInt();
		double x = (double)N / (double)(2 * D + 1);
		int y = N / (2 * D + 1);
		if(0 < x - y) {
			y++;
		}
		System.out.println(y);
	}

	public static void main(String[] args) {
		new Main().compute();
	}

}
