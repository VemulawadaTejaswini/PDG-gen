import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		long[] H = new long[N+1];
		for(int i=0; i<N; i++) {
			H[i] = sc.nextLong();
		}
		sc.close();

		boolean flag = true;

		for(int i=N-1; i>0; i--) {
			if(H[i]< H[i-1]) {
				if(H[i-1]-1 <= H[i]) {
					H[i-1]--;
				}else {
					flag = false;
					break;
				}
			}
		}
		if(flag) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}