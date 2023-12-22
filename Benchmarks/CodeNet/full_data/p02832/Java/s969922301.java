import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count =0;
		int A[] = new int[N];
		boolean b = false;
		for (int i=0;i<N;i++) {
			A[i] = sc.nextInt();
			if (A[i]==1) {
				b=true;
			}
		}
		if (!b) {
			System.out.println(-1);
			return ;
		}
		int now =1;
		for (int i=0;i<N;i++) {
			if (A[i]==now) {
				now++;
			} else {
				count ++;
			}
		}
		System.out.println(count);
	}
}