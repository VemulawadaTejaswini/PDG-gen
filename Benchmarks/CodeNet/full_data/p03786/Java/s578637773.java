import java.util.*;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int result = 1;
		int sum = a[0];
		for (int i = 1; i < n; i++) {
			if((2 * sum) >= a[i]) {
				result++;
			}
			else {
				result = 1;
			}
			sum += a[i];
		}
		System.out.println(result);
	}

}
