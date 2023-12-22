import java.util.Arrays;
import java.util.Scanner;

public class Main {
	int A[];
	void run() {
		Scanner sc = new Scanner(System.in);
		A = new int[3];
		for(int i = 0; i < 3; i++)
			A[i] = sc.nextInt();
		Arrays.sort(A);
		if(A[0]+A[1] == A[2]) System.out.println("Yes");
		else System.out.println("No");
		sc.close();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}