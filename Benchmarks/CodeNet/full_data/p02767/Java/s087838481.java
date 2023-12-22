import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			int N = scan.nextInt();
			int[]X = new int[N];
			int[]S = new int[N];
			for(int i=0;i<N;i++){
				X[i] = scan.nextInt();	
				S[i] = X[i];
			}
			//Pの範囲も１から１００まで
			Arrays.sort(S);
			int ps = S[0];
			int pf = S[N-1];
			
			ArrayList<Integer> minpower = new ArrayList<Integer>();
			
			for(int i = ps;i<=pf;i++) {
				int souwa=0;
				for(int j = 0;j<N;j++) {
					souwa+=(int)Math.pow(X[j]-i, 2);
				}
				minpower.add(souwa);
			}
			
			Collections.sort(minpower);
			
			
			
			System.out.println(minpower.get(0));

			
			
		}
		
		
	}
		

}
