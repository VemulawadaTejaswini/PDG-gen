import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K= scan.nextInt();
		
		int[] L = new int[N];
		
		
		for(int i = 0;i<N;i++){
			
			L[i] = scan.nextInt();
			
		}
		
		Arrays.sort(L);		
		
		
		
		int max =0;
		
		
		for(int i = N-1;i>N-1-K;i--){
			max+=L[i];
		}
		
		
		
		
		
		
		System.out.println(max);
		
	}

}