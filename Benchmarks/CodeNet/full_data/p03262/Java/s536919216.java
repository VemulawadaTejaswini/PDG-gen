import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] input = new int[N];
		int skip = 0;
		boolean coprime = false;
		
		for(int a = 0 ; a < N ; a++){
			input[a] = Math.abs(X-(sc.nextInt()));
		}
		sc.close();
		Arrays.sort(input);
		
		if(N == 1){
			skip = input[0];
		}else{
			for(int a = 1 ; a < N ; a++){
				if(input[a] % input[0] != 0){
					coprime = true;
				}
			}
			skip = coprime ? 1 : input[0];			
		}
		System.out.println(skip);
	}
}