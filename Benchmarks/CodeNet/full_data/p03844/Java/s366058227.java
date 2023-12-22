import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws Exception {
		new Main().run();
	}
	
	void run() {
		Scanner sc=new Scanner(System.in);
		long A=sc.nextLong();
		char op=sc.next().toCharArray()[0];
		long B=sc.nextLong();
		long ans=0;
		if(op=='+')ans=A+B;
		else ans=A-B;
		System.out.println(ans);
	}
	
	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
	
}
