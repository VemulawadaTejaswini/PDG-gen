import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];
		String s  = "YES";
		for(int i=0; i<N; i++) {
			A[i] = sc.nextLong();
		}
		sc.close();
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(i==j)continue;
				if(A[i]==A[j]) {
					s  = "NO";
				}
			}
		}
		System.out.println(s);
	}

}