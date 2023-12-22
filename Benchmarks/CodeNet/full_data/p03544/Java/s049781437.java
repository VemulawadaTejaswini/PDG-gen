import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		System.out.println(lucas(N+1));
	}

	static long lucas(int N) {
		if (N == 1) {
			return 2;
		} else if (N == 2) {
			return 1;
		}
		return lucas(N - 1) + lucas(N - 2);
	}

}
