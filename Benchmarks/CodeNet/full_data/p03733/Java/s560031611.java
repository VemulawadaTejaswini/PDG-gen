import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int N = sc.nextInt();
			long T = sc.nextLong();
			long[] t = new long[N];
			long sum = 0;
			
			for(int i=0;i<N;i++) {
				t[i] = sc.nextLong();
			}
			
			if(N==1) {
				System.out.println(T);
				return;
			}
			
			for(int i=1;i<N;i++) {
				if(t[i]-t[i-1]>=T) {
					sum+=T;
				}else {
					sum+=(t[i]-t[i-1]);
				}
				
				if(i==N-1) {
					sum+=T;
				}
			}
			
			System.out.println(sum);
		}
	}