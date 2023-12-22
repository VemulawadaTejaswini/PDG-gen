import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N, P;
		long ans = 0;

		N = Integer.parseInt(sc.next());
		P = Integer.parseInt(sc.next());

		int[] A = new int[N];
		int oCount = 0;
		int eCount = 0;

		for(int i = 0; i < N; i++){
			A[i] = Integer.parseInt(sc.next());
		}

		for(int i = 0; i < N; i++){
			if(A[i] % 2 != 0){
				oCount++;
			}else{
				eCount++;
			}
		}

		if(P == 0){
			if(oCount >= 2){
				int o = oCount - (oCount % 2);
				while(o > 0){
					ans += comb(oCount, o);
					o -= 2;
				}
			}
			ans += 1;
		}else{
			int o = oCount - ((oCount+1) % 2);
			while(o > 0){
				ans += comb(oCount, o);
				o -= 2;
			}
		}

		ans *= Math.pow(2, eCount);

		System.out.println(ans);

	}

	public static int comb(int n, int r){
		if(r == 0 || r == n) return 1;
		else return comb(n-1, r-1) + comb(n-1, r);
	}

}