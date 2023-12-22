
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		long INF = 1000000007L;
		
		long[] ANS = new long[N];
		long[] A = new long[N];
		long[] G = new long[N];
		long[] C = new long[N];
		long[] T = new long[N];
		long[] AG = new long[N];
		long[] AC = new long[N];
		long[] GA = new long[N];
		long[] AGG = new long[N];
		long[] AGT = new long[N];
		long[] AGA = new long[N];
		
		ANS[2] = 61;
		if(N>3)ANS[3] = 240;
		if(N>4)ANS[4] = 865;
		
		if(N<6){
			System.out.println(ANS[N-1]);
			return;
		}
		
		A[2] = 16;
		G[2] = 15;
		C[2] = 14;
		T[2] = 16;
		AG[2] = 4;
		AC[2] = 3;
		GA[2] = 4;
		AGG[2] = 1;
		AGT[2] = 1;
		AGA[2] = 1;
		
		for(int i=4;i<N-1;i++){
			/*
			A[i+1] = ANS[i]%INF;
			G[i+1] = (ANS[i] - AC[i])%INF;
			C[i+1] = (ANS[i] - (AG[i] + GA[i] + AGG[i] + AGT[i] + AGA[i]))%INF;
			T[i+1] = (ANS[i])%INF;
			
			AC[i+1] = A[i]%INF;
			AG[i+1] = A[i]%INF;
			GA[i+1] = G[i]%INF;
			AGG[i+1] = AG[i]%INF;
			AGT[i+1] = AG[i]%INF;
			
			ANS[i+1] = (4*ANS[i] - (AC[i] + AG[i] + GA[i] + AGG[i] + AGT[i] + AGA[i]))%INF;
			*/
			
				ANS[i] = ANS[i]%INF;
				ANS[i-1] = ANS[i-1]%INF;
				ANS[i-2] = ANS[i-2]%INF;
				
			
			ANS[i+1] = (4*ANS[i] - 3*ANS[i-1] - 2*ANS[i-2]);
			
		}
		
		System.out.println(ANS[N-1]);
		
		
		sc.close();
	}

	
}
