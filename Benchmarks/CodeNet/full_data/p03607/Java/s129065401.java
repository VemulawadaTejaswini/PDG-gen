import java.util.Arrays;
import java.util.Scanner;

class Main{

	static	int count = 0;
	public static void main(String[] args) {



		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		long[] A = new long[N];		

		int ans = 1;
		for(int i = 0;i < N;i++){
			A[i] = scanner.nextLong();

		}
		Arrays.sort(A);			

		int c= 0;
		for(int i = 0;i < N-1;i++){
			if(A[i] != A[i+1]){
				if(c % 2 == 0){
					ans++;
				}
				c = 0;
				
			}else{
				c++;
				if(i == N-2){
					if(c % 2 == 1){
						ans--;
					}
				}
			}
			
			
		}
		if(N == 1){
			ans++;
		}

		System.out.println(ans);



	}

}

class Pair implements Comparable{
	int from;
	int middle;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}


