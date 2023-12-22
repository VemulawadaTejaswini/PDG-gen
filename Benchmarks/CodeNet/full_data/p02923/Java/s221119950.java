import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] H = new int[N];
		for (int i = 0; i < N; i++) 
			H[i] = sc.nextInt();

		int maxMove = 0; 
		int currentMove = 0;
		for (int i = 0; i < N-1; i++) {
			
			if (H[i] >= H[i+1]) {
				currentMove++;
				if (currentMove > maxMove)
					maxMove = currentMove;
			} else {
				currentMove = 0;
			}
		}
		System.out.println(maxMove);
	}
}