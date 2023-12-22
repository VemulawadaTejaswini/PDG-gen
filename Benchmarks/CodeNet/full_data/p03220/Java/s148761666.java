import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int A = sc.nextInt();
		int[] H = new int[N];
		int a = 10000000;
		int b = 0;
		for(int i=0; i<N; i++) {
			H[i] = sc.nextInt();
		}
		sc.close();
		for(int i=0; i<N; i++) {
			int x = T -H[i]*6/1000;
			if(Math.abs(A-x)<a) {
				a = Math.abs(A-x);
				b = i+1;
			}
		}
		System.out.println(b);
	}

}
