import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;


	public void _main(String[] args) {
		Scanner sc = new Scanner(in);
		
		String S = sc.next();
		
		List<List<Integer>> a = new ArrayList<>();
		for(int i=0;i<S.length();i++) {
			a.add(Arrays.asList(i, S.charAt(i) == 'W' ? 0 : 1));
		}
		
		a.sort((o1, o2) -> Integer.compare(o1.get(1), o2.get(1)));
		
		long ans = 0;
		for(int i=0;i<S.length();i++) {
			List<Integer> x = a.get(i);
			if(x.get(1) == 0) {
				ans += Math.abs(i-x.get(0));
			}
		}
		out.println(ans);
		
		
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
