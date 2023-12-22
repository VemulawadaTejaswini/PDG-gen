import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = 0;
		int x = 0;
		int max = 0;
		N = scan.nextInt();
		String S = "";
		S = scan.next();
		String T = "";
		
		while (N > 0) {
			T = S.substring(S.length() - N, S.length() - (N - 1));
			if(T.equals("I")) {
				x = x + 1;
				if(max < x) max = x;
			}
			else if(T.equals("D")) {
				x = x - 1;
			}
			N = N - 1;
		}
		System.out.println(max);
	}
}