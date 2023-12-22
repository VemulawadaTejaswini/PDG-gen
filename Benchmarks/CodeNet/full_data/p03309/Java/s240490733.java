import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int n = scan.nextInt();
		int[] inputs = new int[n];
		int sum = 0;
		for(int i = 0; i < n; i++) {
			inputs[i] = scan.nextInt() - i - 1;
			if(inputs[i] < 0) inputs[i] *= -1;
			sum += inputs[i];
			
		}
		
		int x = 0;
		Arrays.sort(inputs);
		x = inputs[n / 2];
		
		if(sum < n || sum % n == 0) System.out.println(sum);
		else {
			x = sum / n + 1;
			int ans = sum - n * x;
			if(ans < 0) ans *= -1;
			System.out.println(ans);
		}
		
		scan.close();
	}
}
