import java.util.*;

class Main {
	Scanner sc;
	int L;
	
	private void calc() {
		sc = new Scanner(System.in);
		L = sc.nextInt();
		double l = L / 3d;
		System.out.println(l*l*l);
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}
