import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		int N, Min, CheckMin, Self, CheckSelf, T;
		int A[];
		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		A = new int[N];
		for(int i=0; i<N; i++) {
			A[i] = scan.nextInt();
		}

		Min = A[0];
		Self = 0;
		for(int i=1; i<N; i++) {
			if(Min > A[i]) {
				Min = A[i];
				Self = i;
			}
		}

		//mod roop
		while(true) {
			CheckMin = Min;
			CheckSelf = Self;
			for(int i=0; i<N; i++) {
				if(i == CheckSelf)continue;
				T = A[i] % CheckMin;
				if(T != 0 && T < Min) {
					Min = T;
					Self = i;
				}
			}
			if(CheckMin == Min)	break;
		}
		System.out.print(Min);
	}

}
