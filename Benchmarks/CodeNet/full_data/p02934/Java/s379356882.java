import java.util.*;
public class Main {
	Scanner sc;
	int[] A;
	int N;

	public Main() {
		sc = new Scanner(System.in);
	}
	
	private void calc() {
		N = sc.nextInt();
		A = new int[N];
		for (int i = 0; i < N; i++) A[i] = sc.nextInt();
		double s = 0d;
		for (int i = 0; i < N; i++) s += 1d/A[i];
		System.out.println(1d/s);
		System.out.flush();
	}

	public static void main(String[] args) {
		new Main().calc();
	}

}