import java.util.*;
import java.util.stream.*;

public class Main {
	Scanner sc;
	int A, B;
	
	public Main() {
		sc = new Scanner(System.in);
	}
	
	private void calc() {
		A = sc.nextInt();
		B = sc.nextInt();
		int add = A + B;
		int sub = A - B;
		int mul = A * B;
		
		out(max(add, max(sub, mul)));
	}
	
	private int max(int a, int b) {
		return (a>b)?a:b;
	}
	
	private void out(Object o) {
		System.out.println(o);
		System.out.flush();
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		m.calc();
	}

}