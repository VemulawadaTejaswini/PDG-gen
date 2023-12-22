import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		int x[] = new int[N+1];
		int y[] = new int[N+1];
		boolean c[] = new boolean[N+1];
		for (int i = 1; i <= N; i++) {
			x[i] = scanner.nextInt();
			y[i] = scanner.nextInt();
			c[i] = scanner.next().equals("B");
		}
		scanner.close();
		
		int answer = 0;
		int answer2 = 0;
		int FA = 0;
		
		for (int heightSlide = 0; heightSlide < K; heightSlide++) {
			for (int widthSlide = 0; widthSlide < K; widthSlide++) {
				answer = 0;
				answer2 = 0;
				for (int i = 1; i <= N; i++) {
					if (((((x[i] + heightSlide) % (K*2)) - K < 0) ^ (((y[i] + widthSlide) % (K*2)) - K < 0)) == c[i]) {
						answer++;
					} else {
						answer2++;
					}
				}
				FA = Math.max(FA, answer);
				FA = Math.max(FA, answer2);
			}
		}
		
		System.out.println(FA);
		
	}

}