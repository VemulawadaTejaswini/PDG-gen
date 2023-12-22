import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		String S = sc.next();
		
		sc.close();
		
		StringBuffer ans = new StringBuffer();
		
		int pass = 0;
		int irank = 0;
		
		for(int i=0;i<N;i++) {
			char x = S.charAt(i);
			if(x == 'a') {
				if(pass < A+B) {
					pass++;
					ans.append("Yes\r\n");
				}else {
					ans.append("No\r\n");
				}
			}else if(x == 'b') {
				irank++;
				if(pass < A+B && irank <= B) {
					pass++;
					ans.append("Yes\r\n");
				}else {
					ans.append("No\r\n");
				}
			}else {
				ans.append("No\r\n");
			}
		}
		
		out.print(ans.toString());

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
	
	@SuppressWarnings("unused")
	private int[] nextIntArray(Scanner sc, int n) {
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}

	@SuppressWarnings("unused")
	private int[] nextIntArray1origin(Scanner sc, int n) {
		int[] result = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}
}
