import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();

		int w1 = Math.abs(w-x);
		int w2 = x;
		int h1 = Math.abs(h-y);
		int h2 = y;

		double r1 = Math.min((double)w1*(double)h, (double)w2*(double)h);
		double r2 = Math.min((double)w*(double)h1, (double)w*(double)h2);

		System.out.print(Math.max(r1, r2)+" ");

		if(r1==r2) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		sc.close();
	}
}
