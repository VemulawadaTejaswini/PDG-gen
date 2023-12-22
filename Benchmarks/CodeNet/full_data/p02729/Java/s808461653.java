import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();

		int sum_n = 0;
		int sum_m = 0;

		if (N > 1 ){
			for (int i = N-1; i > 0; i-- ){
				sum_n += i ;
			}
		}
		if (M > 1 ){
			for (int i = M-1; i > 0; i-- ){
				sum_m += i ;
			}
		}

		System.out.println( sum_m + sum_n );

	}
}