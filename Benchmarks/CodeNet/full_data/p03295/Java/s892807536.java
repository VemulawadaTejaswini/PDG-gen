import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int a[][] = new int[M][2];
		for(int i = 0; i < M; i++) {
			a[i][0] = sc.nextInt();
			a[i][1] = sc.nextInt();
		}
		//Arrays.sort(a, Comparator.comparingInt(o -> o[1]));
		Arrays.sort(a, Comparator.comparingInt(o -> o[0]));
		
		int min = Integer.MAX_VALUE;
		int ans = 0;
		for(int i = 0; i < M; i++) {
			if(a[i][0] >= min) {
				ans++;
				min = a[i][1];
			} else {
				min = Math.min(min, a[i][1]);
			}
		}
		ans++;
		
		System.out.println(ans);
	}
}
