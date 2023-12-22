import java.util.Scanner;

public class Main {
	static String str;
	static int[] A = new int[3];
	static int[] banboo;

	public static void main(String[] args) {
		readInput();

		solve();
	}

	static void solve() {
		int ans = 1000;
		
		for(int i = 0; i<str.length()-2; i++) {
			int num = Integer.parseInt(str.substring(i, i+3));
			int diff = Math.abs(753 - num);
			if(ans > diff) {
				ans = diff;
			}
		}
		
		System.out.println(ans);
	}
	

	static void readInput() {
		try (Scanner sc = new Scanner(System.in)) {
			str = sc.nextLine();
		}
	}
}
