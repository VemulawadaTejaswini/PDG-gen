import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int k = stdIn.nextInt();
		
		long sum = 0;
		
		int[]a = new int[n];
		int[]b = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = stdIn.nextInt();
			b[i] = stdIn.nextInt();
			sum += b[i];
		}
		
		int[]c = new int[(int)sum];
		int index = 0;
		
		for(int i = 0; i < n; i++) {
			int j = 0;
			while(b[i] != j) {
				c[index++] = a[i];
				j++;
			}
		}
		Arrays.sort(c);
		
		for(int i = 0; i < sum; i++) {
			if(i== k-1) {
				System.out.println(c[i]);
			}
		}
		
	}

}
