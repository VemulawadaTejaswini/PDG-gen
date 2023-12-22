import java.util.Scanner;

public class Main {
	public static final int MAX_HIGHT = 100;

	public static int N;
	public static int[] h;

	public static void main(String[] args) {
		readInput();
		
		int water = 0;
		
		for(int hight = 0; hight < MAX_HIGHT; hight++) {
			for(int i = 1; i <= N; i++) {
				if(h[i] > hight && h[i-1] <= hight) {
					water++;
				}
			}
		}
		
		System.out.println(water);
	}

	public static void readInput() {
		try (Scanner sc = new Scanner(System.in)) {
			N = sc.nextInt();

			h = new int[N+1];

			for(int i = 1; i <= N; i++) {
				h[i] = sc.nextInt();
			}
		}
	}

}
