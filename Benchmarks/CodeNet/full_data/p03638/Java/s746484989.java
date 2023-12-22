import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int n = sc.nextInt();
		int[] arr = new int[h*w];
		int counter = 0;
		for(int i = 1; i <= n; i++) {
			int a = sc.nextInt();
			for(int j = 0; j < a; j++) {
				arr[counter++] = i;
			}
		}
		for(int i = 0; i < h; i++) {
			StringBuilder sb = new StringBuilder();
			for(int j = 0; j < w; j++) {
				if(j!=0) sb.append(" ");
				sb.append(arr[i*w+j]);
			}
			if(i % 2 == 1) {
				sb = sb.reverse();
			}
			System.out.println(sb.toString());
			sb = null;
		}
	}
}