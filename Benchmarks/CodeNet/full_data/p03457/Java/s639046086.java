import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] all = new int[3*N];
		int[] t = new int[N];
		int[] x = new int[N];
		int[] y = new int[N];

		for(int i=0; i<3*N; i++) {
			all[i] = sc.nextInt();
		}for(int j=0; j<N; j++) {
			t[j] = all[j/3];
			x[j] = all[(j-1)/3];
			y[j] = all[(j-2)/3];
		}

		int judge = 0;

		if(x[0] + y[0] <= t[0] && (x[0]+y[0]-t[0])%2 == 0) {
			judge += 1;
		}else {
			judge += 0;
		}

		for(int k=1; k<N; k++) {
			if(Math.abs(x[k]-x[k-1]) + Math.abs(y[k]-y[k-1])
			<= t[k]-t[k-1]) {
				if(Math.abs(x[k]-x[k-1]) + Math.abs(y[k]-y[k-1])
			- (t[k]-t[k-1]) % 2 == 0) {
					judge += 1;
				}else {
					judge += 0;
				}
			}else {
				judge += 0;
			}
		}

		//System.out.println(judge);
		if(judge == N-1) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
