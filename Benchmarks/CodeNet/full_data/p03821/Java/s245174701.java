import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long sum = 0;
		long a[] = new long[N];
		long b[] = new long[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextLong();
			b[i] = sc.nextLong();
		}
		for (int i = N-1; i >=0; i--) {
			if ((a[i]+sum)%b[i]!=0) {
				long temp = (a[i]+sum)/b[i]+1;
				temp = temp *b[i]-(a[i]+sum);
				sum +=temp;
			}
		}
		System.out.println(sum);
	}
}