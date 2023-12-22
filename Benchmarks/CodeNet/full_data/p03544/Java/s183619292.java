import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
	static Scanner sc;

	public static void main(String[] args) throws Exception {
		//InputStream in = new FileInputStream("src/input.txt");
		InputStream in = System.in;

		sc = new Scanner(in);

		int N = sc.nextInt();

		long[] L = new long[N+1];

		L[0] = 2;
		L[1] = 1;
		for(int i = 2; i <= N; i++){
			L[i] = L[i-2] + L[i-1];
		}
		System.out.println(L[N]);
	}
}