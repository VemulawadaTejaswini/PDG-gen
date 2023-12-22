import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		String s = sc.next();
		
		sc.close();

		if(!s.startsWith("A")) {
			out.println("WA");
			return;
		}
		
		int n=0;
		for(int i=2;i<=s.length()-2;i++) {
			if(s.charAt(i) == 'C') {
				n++;
			}
		}
		if(n!=1) {
			out.println("WA");
			return;
		}
		
		String s2 = s.substring(1,s.length()-1).replace('C', 'c') + s.substring(s.length()-1);
		if(!s2.equals(s2.toLowerCase())){
			out.println("WA");
			return;
		}
		
		out.println("AC");
		
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
