import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		double T = scn.nextInt();
		int A = scn.nextInt();
		int p = 0;
		double delta = 1000000000;
		for(int i = 0;i < N;i++) {
			double H = scn.nextDouble();
			if(delta > Math.abs(T - H * 0.006 - A)) {
				p = i;
				delta =  Math.abs(T - H * 0.006 - A);
			}
		}

		System.out.println(p + 1);

	}
}
