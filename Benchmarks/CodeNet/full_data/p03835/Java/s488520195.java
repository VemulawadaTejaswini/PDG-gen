import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		final int K = sc.nextInt();
		final int S = sc.nextInt();

		int counter = 0;
		for( int i = 0; i <= K; i++){
			int sum_i = i;
			if( sum_i == S ){
				counter++;
				continue;
			}
			for( int j = 0; j <= K; j++){
				int sum_j = sum_i + j;
				if( sum_j == S ){
					counter++;
					break;
				}
				for( int k = 0; k <= K; k++){
					int sum_k = sum_j + k;
					if( sum_k == S ){
						counter++;
						break;
					}
					
				}
			}
		}
		System.out.println(counter);
	}
}