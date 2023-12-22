import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] balls =  new int[N];
		int cnt = 0;
		for(int i =0; i < N ; i++ ) {
			int min = 0;
			balls[i] = sc.nextInt();
			min = 2 * Math.min(balls[i], K-balls[i]);
			cnt += min;
		}
		System.out.println(cnt);
	}

}
