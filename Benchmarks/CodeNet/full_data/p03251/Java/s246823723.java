import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		int[] xmap = new int[N];
		for (int i = 0; i < N; i++) {
			xmap[i] = sc.nextInt();
		}
		
		int[] ymap = new int[M];
		for (int i = 0; i < M; i++) {
			ymap[i] = sc.nextInt();
		}
		
		Arrays.sort(xmap);
		Arrays.sort(ymap);
		
		int xlast = xmap[xmap.length-1];
		int yfrast = ymap[0];
		
		for (int i = xlast+1; i <= yfrast; i++) {
			if (X < i && i <= Y) {
				System.out.println("No War");
				return;
			}
		}
		
		System.out.println("War");
	}
}
