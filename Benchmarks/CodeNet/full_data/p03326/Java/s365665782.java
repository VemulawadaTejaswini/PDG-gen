import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long x[] = new long[N];
		long y[] = new long[N];
		long z[] = new long[N];
		long t[] = new long[3*N];
		for(int i=0; i<3*N; i++){
			t[i] = sc.nextLong();
		}
		for(int i=0; i<N; i++){
			x[i] = t[3*i];
		}
		for(int i=0; i<N; i++){
			y[i] = t[3*i+1];
		}
		for(int i=0; i<N; i++){
			z[i] = t[3*i+2];
		}
		long total1 = 0;
		long score1[] = new long[N];
		long total[] = new long[8];
		for(int i=0; i<N; i++){
			score1[i] = x[i] + y[i] + z[i];
		}
		Arrays.sort(score1);
		for(int i=0; i<M; i++){
			total[0] += score1[N-1-i];
		}
		
		long score2[] = new long[N];
		for(int i=0; i<N; i++){
			score2[i] = x[i] + y[i] - z[i];
		}
		Arrays.sort(score2);
		for(int i=0; i<M; i++){
			total[1] += score2[N-1-i];
		}
		
		long score3[] = new long[N];
		for(int i=0; i<N; i++){
			score3[i] = x[i] - y[i] + z[i];
		}
		Arrays.sort(score3);
		for(int i=0; i<M; i++){
			total[2] += score3[N-1-i];
		}
		
		long score4[] = new long[N];
		for(int i=0; i<N; i++){
			score4[i] = x[i] - y[i] - z[i];
		}
		Arrays.sort(score4);
		for(int i=0; i<M; i++){
			total[3] += score4[N-1-i];
		}
		
		long score5[] = new long[N];
		for(int i=0; i<N; i++){
			score5[i] = 0 - x[i] + y[i] + z[i];
		}
		Arrays.sort(score5);
		for(int i=0; i<M; i++){
			total[4] += score5[N-1-i];
		}
		
		long score6[] = new long[N];
		for(int i=0; i<N; i++){
			score6[i] = 0 - x[i] + y[i] - z[i];
		}
		Arrays.sort(score1);
		for(int i=0; i<M; i++){
			total[5] += score6[N-1-i];
		}
		
		long score7[] = new long[N];
		for(int i=0; i<N; i++){
			score7[i] = 0 - x[i] - y[i] + z[i];
		}
		Arrays.sort(score7);
		for(int i=0; i<M; i++){
			total[6] += score7[N-1-i];
		}
		
		long score8[] = new long[N];
		for(int i=0; i<N; i++){
			score8[i] = 0 - x[i] - y[i] - z[i];
		}
		Arrays.sort(score8);
		for(int i=0; i<M; i++){
			total[7] += score8[N-1-i];
		}
		
		Arrays.sort(total);
		System.out.println(total[7]);
	}
}