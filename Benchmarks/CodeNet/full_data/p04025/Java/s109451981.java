import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N  = sc.nextInt();
		int[] a = new int[N];
		for(int i=0;i<N;i++) {
			a[i] = sc.nextInt();
		}
		
		sc.close();
	
		int ans = Integer.MAX_VALUE;
		for(int y=-100;y<=100;y++) {
			int c = y;
			int b = Arrays.stream(a).map(x-> (x-c)*(x-c)).sum();
			ans = Math.min(ans, b);
		}
		
		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
