import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] A = new int[N];
		int[][] BC = new int[M][2];
		for(int i = 0; i < N; i++)
			A[i] = sc.nextInt();
		Arrays.sort(A);
		for(int i = 0; i < M; i++) {
			BC[i][0] = sc.nextInt();
			BC[i][1] = sc.nextInt();
		}
		Arrays.sort(BC, (x,y) -> y[1]-x[1]);
		int num = 0;
		long ans = 0;
		int s = N-1, t = 0;
		while(true) {
			if(t < M) {					
				if(A[s] >= BC[t][1]) {
					ans += A[s];
					num++;
					s--;				
				}
				else {
					if(num + BC[t][0] <= N) {
						ans += (long)BC[t][1] * BC[t][0];
						num += BC[t][0];
						t++;
					}
					else {
						ans += (long)BC[t][1] * (N - num);
						num = N;
					}
				}
			}
			else {
				ans += A[s];
				num++;
				s--;
			}
			if(num >= N)
				break;
		}
		System.out.println(ans);
	}

}