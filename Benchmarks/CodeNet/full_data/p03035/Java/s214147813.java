import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		int ans = B;
		if(A>=6 && A<=12) {
			ans = B/2;
		}else if(A<=5) {
			ans = 0;
		}
		
		out.println(ans);
		
		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
