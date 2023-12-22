import java.util.Scanner;

public class Main {
	static int N;
	static String S;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		S = sc.next();

		int leader = 0;
		int ans = Integer.MAX_VALUE;

		int E[] = new int[N+1];
		int W[] = new int[N+1];
		W[0] = 0;
		// E[0] = 0;


		int count = 0;
		for (int a = 0; a < N; a++) {
			if (S.charAt(a) == 'W') {
				count++;
				W[a+1] = count;
			} else {
				W[a+1] = count;
			}
		}
		count = 0;
		int i = N-1;
		for (int a = N-1; a >= 0; a--) {
			// System.out.println("S.charAt(a) "+S.charAt(a));
			if (S.charAt(a) == 'E') {
				count++;
				E[i] = count;
			} else {
				E[i] = count;
			}
			i--;
		}
		
		// System.out.println(Arrays.toString(W));
		// System.out.println(Arrays.toString(E));
		
		for (int a = 0; a <= N; a++) {
			int left = W[a];
			// System.out.println("a "+ a+" left "+left);
			int right = E[a];
			// System.out.println("a "+ a+" riht "+right);
			ans = Math.min(ans, (left+right));
		}
		System.out.println(ans);
	}
}
// https://www.youtube.com/watch?v=w2AEXSloYk8

//0 1 1 2 2 3 3 3 3 4 5 6 6
// W E W E W E E E W W W E
//
//0 1 1 1 1 2 3 4 4 5 5 6 6
// E W W W E E E W E W E W



//0 0 0 1 2 2
// W W E E W
