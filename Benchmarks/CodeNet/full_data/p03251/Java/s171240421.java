import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int[] x = new int[N];
		for(int i = 0;i < N;++i)
			x[i] = sc.nextInt();
		int[] y = new int[M];
		for(int i = 0;i < M;++i)
			y[i] = sc.nextInt();
		sc.close();
		
		Arrays.sort(x);
		Arrays.sort(y);
		boolean isWar = true;
		if(X < y[0] && x[N-1] < Y && x[N-1] < y[0])
			isWar = false;
		if(isWar)
			System.out.println("War");
		else
			System.out.println("No War");
	}
}
