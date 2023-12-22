import java.util.*;

public class Main {
	Scanner sc;
	int N, D;
	
//=============
// constructor
//
	public Main() {
		sc = new Scanner(System.in);
	}
	
//==================
// instance methods
//
	void out(Object o) {
		System.out.println(o);
		System.out.flush();
	}
	
	public void exec() throws Exception {
		N = sc.nextInt();
		D = sc.nextInt();
		
		int n = (N+2*D) / (2*D+1);
		out(n);
	}
	
//======
// main
//
	public static void main(String[] args) throws Exception {
		Main m = new Main();
		m.exec();
	}

}