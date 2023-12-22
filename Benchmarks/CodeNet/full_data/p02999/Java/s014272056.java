import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int X = sc.nextInt();
		int A = sc.nextInt();
		
		sc.close();

		if(X<A){
			out.println(0);
		}else {
			out.println(10);
		}
		
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
