import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(), w = sc.nextInt(), d = sc.nextInt();
		int[][] num = new int[h][w];
		int[] index = new int[h*w+1];
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				num[i][j] = sc.nextInt();
				index[num[i][j]] = w*i+j;
			}
		}
		int p[] = new int[h*w+1];
		for(int i = 1; i <= h*w-d; i++) {
			p[i] = Math.abs(index[i]/w-index[i+d]/w) + Math.abs(index[i]%w-index[i+d]%w);
		}
		for(int i = h*w-d; i >= 0; i--) {
			p[i] += p[i+d];
		}
		int q = sc.nextInt();
		for(int i = 0; i < q; i++) {
			System.out.println(p[sc.nextInt()] - p[sc.nextInt()]);
		}
	}
}