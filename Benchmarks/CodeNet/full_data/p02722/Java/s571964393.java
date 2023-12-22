import java.util.Scanner;

class Main{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt();
		long count = 0;

    long kx = 0;
		long nx = 0;
		for(long K = 2; K < N; K++){
			nx = N;
			for(kx = K;kx < nx;){
				if(nx % kx == 0){
					nx = nx / kx;
				}else{
					nx = nx - kx;
				}
				if(nx == 1){
					count++;
					break;
				}
			}
		}

		System.out.println(count);
		// System.out.println(S.toString());

	}
}
