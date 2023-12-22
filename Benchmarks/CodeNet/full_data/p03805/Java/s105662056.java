import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static int c = 0;
	static int n;
	static int m;
	static boolean[][] bool;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		bool = new boolean[n + 1][n + 1];
		for(int i = 0 ; i < n + 1 ; i++) {
		Arrays.fill(bool[i], false);
		}
		for(int i = 0 ; i < m ; i++) {
			bool[sc.nextInt()][sc.nextInt()] = true;
		}
		sc.close();
			n(1 + "", n);

		System.out.println(c);

	}
	public static void n(String s , int n) {
		if(s.length() == n) {
			c++;
			return;
		}
		for(int i = 1 ; i <= n ; i++) {
			int last = Integer.parseInt(s.charAt(s.length() - 1) + "");
			if(!s.contains(Integer.toString(i)) && (bool[last][i] || bool[i][last]))
					n(s + "" + i , n);
		}


	}
}

