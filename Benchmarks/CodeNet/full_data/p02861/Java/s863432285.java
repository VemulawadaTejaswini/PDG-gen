import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N;
		N = stdIn.nextInt();
		int[] x, y;
		x = new int[N];
		y = new int[N];
		for(int i = 0; i < N; i++) {
			x[i] = stdIn.nextInt();
			y[i] = stdIn.nextInt();
		}

		double sum = 0;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(i == j){ continue; }
				double d = distance(x[i], x[j], y[i], y[j]);
				sum += d;
			}
		}
		System.out.println(sum / kaijou(N) * kaijou(N - 1));
	}

	static double distance(int x1, int x2, int y1, int y2) {
		int x, y;
		x = x1 - x2;
		y = y1 - y2;
		x *= x;
		y *= y;
		return Math.sqrt(x + y);
	}

	static int kaijou(int N) {
		int ans = 1;
		while(N > 0){
			ans *= N;
			N--;
		}
		return ans;
	}
}