
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int[] east = new int[n + 1];
		int[] west = new int[n + 1];
		for(int i = 0; i < n + 1; i++) {
			east[0] = 0;
			west[0] = 0;
		}
		for(int i = 1; i < n + 1; i++) {
			if(s.charAt(i - 1) == 'W') {
				west[i] = west[i - 1] + 1;
				east[i] = east[i - 1];
			} else {
				west[i] = west[i - 1];
				east[i] = east[i - 1] + 1;
			}
		}
		int ans = Integer.MAX_VALUE;
		for(int i = 1; i < n + 1; i++) {
			int min = Math.min(ans, west[i - 1] + east[i + 1]);
		}
		System.out.println(ans);
	}

}
