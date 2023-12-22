import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println(solve());
	}

	public static int solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= N; i++) {
			String s = "" + i;
			boolean ns = true;
			boolean n3 = false, n5 = false, n7 = false;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == '0' || s.charAt(j) == '1' || s.charAt(j) == '2' 
						|| s.charAt(j) == '4' || s.charAt(j) == '6' || s.charAt(j) == '8' || s.charAt(j) == '9') {
					ns = false;
					break;
				}

				if (s.charAt(j) == '3')
					n3 = true;
				if (s.charAt(j) == '5')
					n5 = true;
				if (s.charAt(j) == '7')
					n7 = true;
				
			}
			if (ns && n3 && n5 && n7)
				sum++;
		}
		
		return sum;
	}
}
