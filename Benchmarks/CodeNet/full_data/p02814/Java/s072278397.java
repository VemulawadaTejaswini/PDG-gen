import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int[] alphas = new int[n];
			
			int max = 0;
			for(int i = 0 ; i < n ; i++ ) {
				alphas[i] = sc.nextInt() / 2; //割った状態でセット
				if ( alphas[i] > max ) {
					max = alphas[i];
				}
			}
			
			int steps = (m / max) + 1;
			int count = 0;
			
			for(int i = 0 ; i < steps ; i++ ) {
				int num = (i+1) * max;
				if (num > m) {
					continue;
				}
				
				boolean match = true;
				for(int j = 0 ; j < n ; j++ ) {
					if ( num % alphas[j] == 0 ) {
						int divided = num / alphas[j];
						if ( (divided - 1) % 2 == 0 ) {
							//matched!
						}
						else {
							match = false;
							break;
						}
					}
					else {
						match = false;
						break;
					}
				}
				
				if ( match ) {
					count++;
				}
			}
			
			System.out.println(count);
		}
	}
}