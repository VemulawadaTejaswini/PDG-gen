import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int X = sc.nextInt();
		
		int g[] = new int[N];
		int kei =0;
		
		for(int i=0;i<N;i++) {
			g[i] = sc.nextInt();
			kei += g[i];
		}
		
		Arrays.sort(g);
		System.out.println(N+(X-kei)/g[0]);

	}
}