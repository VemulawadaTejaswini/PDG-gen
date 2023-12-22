import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		int[][] x= new int[N][D];

		for(int i=0; i<N; i++){
			for(int j=0; j<D; j++){
				x[i][j] = sc.nextInt();
			}
		}
		int ans = 0;
		for(int outi=0; outi<N; outi++){
			for(int ini=outi+1; ini<N; ini++){
				int dist = 0;
				for(int j=0; j<D; j++){
					dist += Math.pow(x[outi][j] - x[ini][j], 2);
				}
				if(Math.sqrt(dist) == (int)Math.sqrt(dist))ans++;
			}
		}


		System.out.println(ans);
	}
}
