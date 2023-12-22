import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X[] =new int[100001];
		int Lp[] =new int[100001];
		int Lm[] =new int[100001];

		for(int i = 0; i < N; i++) {
			X[i] = sc.nextInt();
			Lp[i] = sc.nextInt();
		}

		for(int i = 0; i < N; i++) {
			for(int j = N-1; j > i; j--) {
				if(X[j-1] > X[j]) {
					int tmpX = X[j-1];
					X[j-1] = X[j];
					X[j] = tmpX;
					int tmpL = Lp[j-1];
					Lp[j-1] = Lp[j];
					Lp[j] = tmpL;
				}
			}
		}

		for(int i = 0; i < N; i++) {
			Lm[i] = -Lp[i];
		}

		int N1 = N;
		int N2 = N;

		for(int i = 1; i < N; i++) {
//			System.out.println(X[i]+":"+Lm[i]+":"+Lp[i]+":"+(X[i]-Lm[i]) +":"+ (X[i-1]+Lp[i-1]) +":"+ (X[i]+Lp[i]) +":"+ (X[i+1]+Lm[i+1]));
			if(X[i]+Lm[i] < X[i-1]+Lp[i-1] && X[i]+Lp[i] < X[i+1]+Lm[i+1])
				N1--;
		}

		for(int i = 0; i < N-1; i++) {
//			System.out.println(X[i]+":"+Lm[i]+":"+Lp[i]+":"+(X[i]+Lp[i])+":"+(X[i+1]+Lm[i+1]));
			if(X[i]+Lp[i] > X[i+1]+Lm[i+1])
				N2--;
		}

		if(N1<N2) {
			System.out.println(N1);
		}else {
			System.out.println(N2);
		}

	}
}





