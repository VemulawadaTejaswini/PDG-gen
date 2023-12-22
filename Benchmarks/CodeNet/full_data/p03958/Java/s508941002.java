import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int T = sc.nextInt();
		int max = sc.nextInt();
		for (int i=1; i<T; i++) {
			int a = sc.nextInt();
			if (a>max) max = a;
		}
		//
		int remain = K-max;
		if (max-remain>0) System.out.println(max-remain-1);
		else System.out.println(0);
		sc.close();
	}
}
