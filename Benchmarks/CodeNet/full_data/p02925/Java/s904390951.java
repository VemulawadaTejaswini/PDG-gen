import java.util.Scanner;

public class Main {
	// a b c
	// a d e
	// f b d
	// f c e
	// (a,f) (b) , (c,d) (e)	
	// (1,2) (1,3) (1,4)
	// (1,2) (2,3) (2,4)
	// (3,4) (1,3) (2,3)
	// (3,4) (1,4) (2,4)
	static int solve(int[][] A){
		int N = A.length;
		int day = 0;
		int current[] = new int[N];
		int totalRound = N * (N -1) / 2;
		int currentRound = 0;
		while(currentRound < totalRound){
			int r = 0;
			int next[] = current.clone();
			for(int i = 0; i < current.length ; ++i){
				if(current[i] >= N - 1){
					continue;
				}
				int nj = A[i][current[i]];				
				if(i < nj && A[nj][current[nj]] == i){
					++r;
					next[i]++;
					next[nj]++;
				}
			}
//			System.out.println(day+" "+r);
			currentRound += r;
			if(r == 0){
				return -1;
			}
			++day;
			current = next;
		}
		return day;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[][] = new int[N][N - 1];
		for(int i = 0 ; i < N ; ++i){
			for(int j = 0 ; j < N - 1; ++j){
				A[i][j] = sc.nextInt() - 1;
			}
		}
		int day = solve(A);
		System.out.println(day);
	}
}
