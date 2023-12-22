import java.util.*;

public class Main {
	static char plus = '+';
	static char minus = '-';
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int[] n = new int[4];
		for (int i = 0; i < 4; i++) {
			n[i] = s.charAt(i) - '0';
		}
		
		char[] op = {plus, plus, plus};
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 2; k++) {
					if (calc(n, op) == 7) {
						System.out.println("" + n[0] + op[0] + n[1] + op[1] + n[2] + op[2] + n[3] + "=7");
						return;
					}
					op[2] = (op[2] == plus ? minus : plus);
				}
				op[1] = (op[1] == plus ? minus : plus);
			}
			op[0] = (op[0] == plus ? minus : plus);
		}
	}
	
	public static int calc(int[] n, char[] op) {
		int ans = n[0];
		for (int i = 0; i < op.length; i++) {
			if (op[i] == plus) {
				ans += n[i + 1];
			} else {
				ans -= n[i + 1];
			}
		}
		
		return ans;
	}
}