import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N , K = 0;
		long A, B;
		N = sc.nextInt();
		A = sc.nextLong();
		B = sc.nextLong();
		long[] H = new long[N];
		for (int i = 0; i < N; i++) {
			H[i] = sc.nextInt();
		}
		long Tmax = 1000000000;
		long Tmin = 0;
		long T = 0;
		while(Tmax-Tmin > 1){
			T = Tmin + (Tmax-Tmin)/2;
			K = 0;
			for(int i = 0 ; i < N ; i++){
				if(H[i] > B*T){
					K += Math.ceil((double)(H[i] - B*T) / (double)(A - B));
				}
			}
			
			if(K > T){
				Tmin = T;
			}
			else if(K <= T){
				Tmax = T;
			}
		}
		System.out.println(Tmax);
	}
}