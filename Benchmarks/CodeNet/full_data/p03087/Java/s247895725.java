import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int Q = sc.nextInt();
		
		String S = sc.next();
		
		int[] map = new int[N];
		for (int i = 1; i < S.length(); i++) {
			if (S.charAt(i-1) == 'A' && S.charAt(i) == 'C') 
				map[i]++;
		}
		
		for (int i = 1; i < map.length; i++) {
			map[i] += map[i-1];
		}
		
		for (int i = 0; i < Q; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			int ans = map[r-1] - map[l-1];
			System.out.println(ans);
		}
	}
}
