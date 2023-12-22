import java.util.*;

public class Main {
	Scanner sc;
	int a,b;
	
	static String testInput = "998244353 99824435";
/*-------------
 * constructor
 */
	public Main() {
		sc = new Scanner(System.in);
	}
	public Main(String input) {
		sc = new Scanner(input);
	}
	
/*------------------
 * instance methods
 */
	void out(Object o) {
		System.out.println(o);
		System.out.flush();
	}
	
	public void exec() throws Exception {
		a = sc.nextInt();
		b = sc.nextInt();
		
		int k = (a+b)/2;
		if (k*2 != a+b) out("IMPOSSIBLE");
		else out(k);
	}
	
/*------
 * main
 */
	public static void main(String[] args) throws Exception {
		Main m = new Main();
		m.exec();
	}
}

	