import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int T = scan.nextInt();
		int[]c = new int[N];
		int[]t = new int[N];
		for(int i = 0; i < N; i++) {
			c[i] = scan.nextInt();
			t[i] = scan.nextInt();
		}
		scan.close();
		int min = 10000;
		for(int i = 0; i < N; i++) {
			if(t[i] <= T) {
				min = Math.min(min, c[i]);
			}
		}
		if(min <= T) {
			System.out.println(min);
		}else {
			System.out.println("TLE");
		}
	}
}
