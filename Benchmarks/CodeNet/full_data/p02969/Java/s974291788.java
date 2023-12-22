import java.util.*;

public class Main {
	Scanner sc;
	int r;
	
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
		r = sc.nextInt();
		
		out(3*r*r);
	}
	
//======
// main
//
	public static void main(String[] args) throws Exception {
		Main m = new Main();
		m.exec();
	}

}