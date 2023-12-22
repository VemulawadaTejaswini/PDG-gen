import java.util.Scanner;

public class Main {

	private void solve() {
		Scanner in = new Scanner(System.in);
		long N = in.nextInt();
		double d_k = 0;
		long i_k = 0;
		for (long i = 1; i <= 3500; i++) {
			for (long j = 1; j <= 3500; j++) {
				if(4*i*j - N*i - N*j == 0) continue;
				d_k = (double)(N*i*j) / (4*i*j - N*i - N*j);
				i_k = N*i*j / (4*i*j - N*i - N*j);
				if(d_k == i_k && i_k >= 0 && i_k <= 3500){
					System.out.println(i+" "+j+" "+i_k);
					//System.out.println(4*i*j*i_k);
					//System.out.println(N*(i*j+j*i_k+i_k*i));
					return;
				}
			}
		}
		
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}