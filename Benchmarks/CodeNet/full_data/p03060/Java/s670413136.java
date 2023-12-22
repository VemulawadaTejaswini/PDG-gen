

import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int ans =0 ;
		int[] V = new int[N];
		int[] C = new int[N];
		
		for(int i=0;i<N;i++){
			V[i] = Integer.parseInt(sc.next());
		}
		for(int i=0;i<N;i++){
			C[i] = Integer.parseInt(sc.next());
		}
		
		for(int i=0;i<N;i++){
			if(V[i]-C[i]>0)ans+=(V[i]-C[i]);
		}


		System.out.println(ans);
		
		
		sc.close();
	}
	
}
