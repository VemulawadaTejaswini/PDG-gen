import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int[] a = new int[N];
		int[] b = new int[N];
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
			a[i] = stdIn.nextInt();
			if(i > N/2 - 1) {
				b[i] = a[i];
				sum += b[i];
			}
		}
		
		for(int i = N/2 - 1; i >= 0; i--) {
			int count = 0;
			for(int j = 2*i+1; j < N; j += i+1) {
				count += b[j];
			}
			if(count%2 == a[i]) {
				b[i] = 0;
			}
			else {
				b[i] = 1;
			}
			sum += b[i];
		}
		
		System.out.println(sum);
		for(int i = 0; i < N; i++) {
			if(b[i] == 1) {
				System.out.println(i+1);
			}
		}

	}

}