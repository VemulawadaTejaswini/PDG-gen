import java.util.*;
public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int A, B ,M;
		A = sc.nextInt();
		B = sc.nextInt();
		M = sc.nextInt();
		int dataA[] = new int[A];
		int dataB[] = new int[B];
		int minA = Integer.MAX_VALUE;
		int minB = Integer.MAX_VALUE;
		
		for(int i = 0; i < A; i++) {
			dataA[i] = sc.nextInt();
			minA = Math.min(minA,dataA[i]);
		}
		for(int i = 0; i < B; i++) {
			dataB[i] = sc.nextInt();
			minB = Math.min(minB,dataB[i]);
		}
		int ans = minA+minB;
		for(int i = 0; i<M; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int c = sc.nextInt();
			ans = Math.min(ans, dataA[x-1] + dataB[y-1] - c);
		}
		System.out.println(ans);
		
		
	}
}

