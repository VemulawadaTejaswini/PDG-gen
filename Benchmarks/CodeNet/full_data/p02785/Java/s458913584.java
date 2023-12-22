import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		
		java.util.Scanner scan = new java.util.Scanner(System.in);

		long N = scan.nextInt();
		long K = scan.nextInt();
		long[] H = new long[N];
		long sum = 0;
		
		if(K >= N ) {
			System.out.println(N);
		}
		
		for (int i = 0; i < N; i++) {
			H[i] = scan.nextLong();
		}
		
		Arrays.sort(H);
		
		for(int i =N-1; K>0  ; i--) {
			H[i] = 0;
			K--;
		}
	
		for(long h : H) {
			sum += h;
		}
			System.out.println(K + sum);
	
	}
}
