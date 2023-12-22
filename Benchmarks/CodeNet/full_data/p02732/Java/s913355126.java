import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long input[] = new long[n];
		long ball[] = new long[200001];
		

		for(int i = 0; i < n; i++){
			input[i] = scan.nextLong()-1;
		}
		
		Arrays.fill(ball, 0);
		for(int i = 0; i < n; i++){
			ball[(int)input[i]] ++;
		}
		
		long sum = 0;
		
		for(int i = 0; i < 200001; i++){
			long x = ball[i];
			sum += (x*(x-1))/2; 
		}

		for(int i = 0; i < n; i++){
			long x = input[i];
			long y = ball[(int) x];
			long z = Math.max(y - 1, 0);
			System.out.println(sum - ((y * (y - 1))/2) + ((z * (z - 1))/2));
		}
	}
}