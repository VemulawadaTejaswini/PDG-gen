import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		String S = sc.next();
		sc.close();

		int[] cntZero = new int[N+2];
		int[] cntOne = new int[N];
		boolean flg = false;
		int numZ = 0;
		int numO = 0;
		if(S.charAt(0)=='0') {
			flg=true;
			cntOne[numO++]=0;
		}
		for(int i =0;i < N;i++) {
			if(!flg && S.charAt(i)=='1') {
				cntOne[numO++] = i;
				flg = true;
			}else if(flg && S.charAt(i)=='0'){
				cntZero[numZ++] = i;
				flg = false;
			}
		}
		cntZero[numZ++] = N;
		int max = 0;
		if(numZ -1 < K) {
			max = N;
		}else{
			for(int i = K;i < numZ;i++) {
				if(cntZero[i] - cntOne[i-K] > max) {
					max = cntZero[i] - cntOne[i-K];
				}
			}
		}
		System.out.println(max);
	}
}