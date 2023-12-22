import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		String s = sc.next();
		String t = sc.next();

		sc.close();

		int ans = N*2;

		for(int i=N;i>0;i--) {
			//重なりがiを調べる

			if(t.substring(0,i).equals(s.substring(N-i))) {
				ans = N*2-i;
				break;
			}

		}

		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
