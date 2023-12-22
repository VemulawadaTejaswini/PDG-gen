import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long P = sc.nextLong();

		long conAns = 0;
		long num[] = new long[1024];
		long ans[] = new long[1024];
		int div = 2;
		int cnt = 0;
		int ans1 = 0;
		int ans2 = 0;
		num[0] = P;
		long temp = P;


		int k = 0;
		if(N ==1||P==1) {
			conAns=1;
		}else {
			for(;k<P/(2*N);k++) {


				for(int i = 0; i<= P/2;i++) {

					for(div= k+2;(temp/2) >= div;div++) {

						if(temp % div == 0) {
							num[i] = div;
							temp/=div;
							cnt++;
							break;

						}
					}

					if(cnt == N) {
						num[i+1] = temp;
						break;
					}

				}
				long r = 1;long b=num[0];

				for(int i = 1;i < N;i++) {
					long a = num[i];
					while( (r = a % b) != 0 ) {
			            a = b;
			            b = r;
			        } //b
				}
				ans[k] = b;
				if(conAns < ans[k]) {
					conAns = ans[k];
				}
			}
		}
		System.out.println(conAns);

	}
}