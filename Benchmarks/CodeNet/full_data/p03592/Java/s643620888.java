import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		for (int i=0;i<=N;i++) {
			for (int j=0;j<=M;j++) {
				if (i*M+j*N-2*i*j==K) {
					System.out.println("Yes");
					return ;
				}
			}
		}
		System.out.println("No");
		return ;
	}

	public class People implements Comparable<People> {
		int a;
		int b;
		@Override
		public int compareTo(People o) {
			return this.a - o.a;
		}

	}
}