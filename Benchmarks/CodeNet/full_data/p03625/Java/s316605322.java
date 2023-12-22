import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		long ary[] = new long[N];
		
		for(int i = 0; i < N; i++) {
			ary[i] = sc.nextLong();
		}
		
		Arrays.sort(ary);
		
		int cnt = 0;
		long sideLength1 = 0;
		long sideLength2 = 0;
		
		for(int i = N - 1; i > 0; i--) {
			if(ary[i] == ary[i - 1] && cnt == 0) {
				sideLength1 = ary[i];
				cnt++;
				i--;
				continue;
			}
			
			if(ary[i] == ary[i - 1] && cnt == 1) {
				sideLength2 = ary[i];
				cnt++;
				i--;
			}
			
			if(cnt >= 2) {
				System.out.println(sideLength1 * sideLength2);
				return;
			}
		}
		System.out.println(0);
	}
}
