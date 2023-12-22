import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int L = sc.nextInt();
		int R = sc.nextInt();

		sc.close();

//		R = Math.min(L + 2019, R);

		if(R-L > 3000) {
			out.println(0);
			return;
		}
		
		int ans = Integer.MAX_VALUE;
		for(int x=L;x<R;x++) {
			for(int y=x+1;y<=R;y++) {
//				if(x==y)continue;
				
				int m = (int)(((long)x * y) % 2019);
				ans = Math.min(ans, m);
			}
		}
		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
