import java.util.Arrays;
import java.util.Scanner;

class Main{


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int H = scanner.nextInt();
		int[]a = new int[N];
		int[]b = new int[N];

		for(int i = 0;i < N;i++){
			a[i] = scanner.nextInt();
			b[i] = scanner.nextInt();
		}

		Arrays.sort(b);
		
		int amax = 0;
		for(int i =0 ;i < N;i++){
			amax = Math.max(amax, a[i]);
		}

		int ans = H;
		for(int k = N-1;k >= 0;k--){
			if(k != N-1){
				H -= b[k+1];
			}
			int cnt = 0;

			if(H > 0){
				if(H%amax != 0){
					cnt = (H /amax)+1 ;
				}else{
					cnt = (H /amax);
				}
			}
			ans = Math.min(ans, N-k-1 + cnt);
			

		}
		System.out.println(ans);


	}
}
class Pair implements Comparable{
	int from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}

