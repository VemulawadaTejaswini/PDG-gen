import java.util.*;

class Main {
	Scanner sc;
	int X;
	
	void calc() {
		sc = new Scanner(System.in);
		X = sc.nextInt();
		System.out.println( (X/500)*1000 + (X%500)/5*5 );
	}
	
	public static void main(String[] args) {
		new Main().calc();
	}
}
