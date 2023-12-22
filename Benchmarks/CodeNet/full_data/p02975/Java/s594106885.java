
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		for (int i=0;i<N;i++) {
			if (A[(i+1)%N]!=(A[i]^A[(i+2)%N])) {
				System.out.println("No");
				return ;
			}
		}
		System.out.println("Yes");
		return ;
	}
}