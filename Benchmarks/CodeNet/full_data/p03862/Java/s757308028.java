import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		long x = sc.nextLong();
		
		long[] mapLeft = new long[N];
		long[] mapRigth = new long[N];
		for (int i = 0; i < N; i++) {
			mapLeft[i] = sc.nextLong();
			mapRigth[i] = mapLeft[i];
		}
		
		long ansLeft = 0;
		for (int i = 0; i < N-1; i++) {
			long tmp = mapLeft[i] + mapLeft[i+1];
			if (tmp > x) {
				long eat = tmp - x;
				mapLeft[i+1] -= eat;
				ansLeft += eat;
			}
		}
		
		long ansRigth = 0;
		for (int i = N-1; 0 < i; i--) {
			long tmp = mapRigth[i-1] + mapRigth[i];
			if (tmp > x) {
				long eat = tmp - x;
				mapRigth[i-1] -= eat;
				ansRigth += eat;
			}
		}
		
		System.out.println(Math.min(ansLeft, ansRigth));
		
	}
}