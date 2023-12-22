import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		String s = sc.next();
		
		int a = 15-s.length();
		
		int w = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == 'o') {
				w++;
			}
		}
		
		w+=a;
		if(w>=8) {
			out.println("YES");
		}else {
			out.println("NO");
		}
		
		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
