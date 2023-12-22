import java.util.*;
public class Main {
	Scanner sc;
	long N;

	public Main() {
		sc = new Scanner(System.in);
	}
	
	private void calc() {
		N = sc.nextLong();
		
		System.out.println( N*(N-1)/2 );
		System.out.flush();
	}

	public static void main(String[] args) {
		new Main().calc();
	}

}