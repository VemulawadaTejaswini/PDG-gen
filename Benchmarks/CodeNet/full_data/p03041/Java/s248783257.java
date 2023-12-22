import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		
		K--;
		String s = sc.next();
		
		String newS ="";
		newS += s.substring(0,K);
		newS += s.substring(K,K+1).toLowerCase();
		newS += s.substring(K+1);
		
		out.println(newS);
		
		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
