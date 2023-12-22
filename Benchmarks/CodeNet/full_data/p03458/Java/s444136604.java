import java.util.Scanner;

public class Main {
	
	static int FA;
	static int N;
	static int K;
	static int x[];
	static int y[];
	static boolean c[];
	
	public static void main(String[] args) {
		ABC086_C_Ans ans = new ABC086_C_Ans();
		ans.start();
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		K = scanner.nextInt();
		x = new int[N+1];
		y = new int[N+1];
		c = new boolean[N+1];
		for (int i = 1; i <= N; i++) {
			x[i] = scanner.nextInt();
			y[i] = scanner.nextInt();
			c[i] = scanner.next().equals("B");
		}
		scanner.close();
		
		for (int heightSlide = 0; heightSlide < K; heightSlide++) {
			ABC086_C_Calc calc = new ABC086_C_Calc(heightSlide);
			calc.start();
		}
		
		System.out.println(FA);
		
	}

}

class ABC086_C_Ans extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(1900);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Main.FA);
	}
}

class ABC086_C_Calc extends Thread {
	int heightSlide;
	public ABC086_C_Calc(int i) {
		heightSlide = i;
	}
	@Override
	public void run() {
		int answer = 0;
		int answer2 = 0;
		for (int widthSlide = 0; widthSlide < Main.K; widthSlide++) {
			answer = 0;
			answer2 = 0;
			for (int i = 1; i <= Main.N; i++) {
				if (((((Main.x[i] +heightSlide) % (Main.K*2)) - Main.K < 0) ^ (((Main.y[i] + widthSlide) % (Main.K*2)) - Main.K < 0)) == Main.c[i]) {
					answer++;
				} else {
					answer2++;
				}
			}
			Main.FA = Math.max(Main.FA, answer);
			Main.FA = Math.max(Main.FA, answer2);
		}
	}
}