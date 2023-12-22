import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		for (int i=0;i<N;i++) {
			int x = sc.nextInt();
			int l = sc.nextInt();
			A[i] = x+l;
		}
		Arrays.sort(A);
		int count =0;
		int now =0;
		for (int i=0;i<N;i++) {
			if (now<=A[i]) {
				count ++;
				now = A[i];
			}
		}
		System.out.println(count);
	}
}