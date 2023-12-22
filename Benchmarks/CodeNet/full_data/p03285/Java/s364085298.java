import java.util.*;

class Main {
	public static void main (String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	int N = scanner.nextInt();
		
		String s = calculate(N);
		System.out.println(s);
	}
	
	public static String calculate(int n) {
		String str = null;
		
		calc:
		for (int x = 0; x <= n; x++) {
			for (int y = 0; y <= n; y++) {
				if ( n == 4*x + 7*y) {
					str = "Yes";
					break calc;
				}
			}
			str ="No";
		}
		
		//System.out.println(str);
		return str;
	}
}