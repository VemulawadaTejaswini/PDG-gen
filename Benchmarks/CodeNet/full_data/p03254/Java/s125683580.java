import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int x = sc.nextInt();
		int[] a = new int[N];
		
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		
		System.out.println(result(x,a));
		sc.close();
	}

	private static int result(int x, int[] a) {
		int count = 0;
		
		for(int t:a) {
			if(x > 0) {
				x -= t;
				count++;
			}
		}
		
		if(x < 0 || x > 0) {
			count--;
		}
		
		return count;
	}
}