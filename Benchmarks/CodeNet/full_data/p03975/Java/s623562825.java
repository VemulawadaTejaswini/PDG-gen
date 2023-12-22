import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int cnt = 0;
		for (int i=0; i<N; i++) {
			int num = sc.nextInt();
			if (num<A || B<=num) cnt++;
		}
		System.out.println(cnt);
		sc.close();
	}

}
