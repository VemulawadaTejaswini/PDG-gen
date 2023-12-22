import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int T = scan.nextInt();
		int A = scan.nextInt();

		int[] H = new int[N] ;
		
		for (int i =0; i<N ;i++){
			H[i] = scan.nextInt();
		}
		
		double score = Math.abs((double)A - ((double)T - (double)H[0] * 0.006));
		int candidate = 1;
		
		for (int i =1; i<N ;i++){
			if (score > Math.abs((double)A - ((double)T - (double)H[i] * 0.006))){
				score = Math.abs((double)A - ((double)T - (double)H[i] * 0.006));
				candidate = i+1;
			}
		}
		
		System.out.println(candidate);
		
	}

}